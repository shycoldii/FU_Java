package com.example.demo.controller;
import com.example.demo.exception.CategoryNotFoundException;
import com.example.demo.exception.NotPutting;
import com.example.demo.exception.TaskNotFoundException;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.Category;
import com.example.demo.model.Task;
import com.example.demo.model.User;
import com.example.demo.repository.CategoryRep;
import com.example.demo.repository.TaskRep;
import com.example.demo.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.net.URLDecoder;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@RestController
@RequestMapping("test")
public class MyController {
   private final CategoryRep categoryRep;
   private final TaskRep taskRep;
   private final UserRep userRep;
   @Autowired public MyController(CategoryRep categoryRep, TaskRep taskRep, UserRep userRep

                                  ){
      this.categoryRep = categoryRep;
      this.taskRep = taskRep;
      this.userRep = userRep;
   };

   @PostMapping("/categories")
   Category newCategory(@RequestBody Category newCategory){
      System.out.println(newCategory);
      return categoryRep.save(newCategory);
   }
   @PostMapping("/tasks")
   Task newTask(@RequestBody Task newTask){
      System.out.println(newTask);
      return taskRep.save(newTask);
   }
   @PostMapping("/users")
    User newUser(@RequestBody User newUser){
      System.out.println(newUser);
      return userRep.save(newUser);
   }
   @GetMapping("/categories")
   List<Category> allCategories() {
      return categoryRep.findAll();
   }
   @GetMapping("/users")
   List<User> allUsers() {
      return userRep.findAll();
   }
   @GetMapping("/tasks")
   List<Task> allTasks() {
      return taskRep.findAll();
   }
   @GetMapping("/categories/{id}")
   Category onecat(@PathVariable Long id) {

      return categoryRep.findById(id)
              .orElseThrow(() -> new CategoryNotFoundException(id));
   }
   @GetMapping("/tasks/{id}")
   Task onetask(@PathVariable Long id) {

      return taskRep.findById(id)
              .orElseThrow(() -> new TaskNotFoundException(id));
   }
   @GetMapping("/users/{id}")
   User oneuser(@PathVariable Long id) {

      return userRep.findById(id)
              .orElseThrow(() -> new UserNotFoundException(id));
   }
   @DeleteMapping("/users/{id}")
   void deleteUser(@PathVariable Long id) {
      userRep.deleteById(id);
   }
   @DeleteMapping("/tasks/{id}")
   void deleteTask(@PathVariable Long id) {
      taskRep.deleteById(id);
   }
   @DeleteMapping("/categories/{id}")
   void deleteCategory(@PathVariable Long id) {
      categoryRep.deleteById(id);
   }
   @PutMapping("/categories/{id}")
   Category replaceCategory(@RequestBody Category category, @PathVariable Long id) {
         return categoryRep.findById(id)
                 .map(employee -> {
                    employee.setName(category.getName());
                    return categoryRep.save(employee);
                 })
                 .orElseGet(() -> categoryRep.save(category));
   }
   @PutMapping("/tasks/{id}")
   Task replaceTask(@RequestBody Task task, @PathVariable Long id) {
      return taskRep.findById(id)
              .map(employee -> {
                 employee.setName(task.getName());
                 employee.setDescription(task.getDescription());
                 employee.setTaskDay(task.getTaskDay());
                 employee.setStatus(task.getStatus());
                 employee.setUser(task.getUser());
                 employee.setCategory(task.getCategory());
                 return taskRep.save(employee);
              })
              .orElseGet(() -> taskRep.save(task));
   }
   @PutMapping("/users/{id}")
   User replaceUser(@RequestBody User user, @PathVariable Long id) {
      return userRep.findById(id)
              .map(employee -> {
                 employee.setLogin(user.getLogin());
                 employee.setFirstName(user.getFirstName());
                 employee.setSecondName(user.getSecondName());
                 employee.setPatronymic(user.getPatronymic());
                 employee.setBirthday(user.getBirthday());
                 employee.setTasks(user.getTasks());
                 return userRep.save(employee);
              })
              .orElseGet(() -> userRep.save(user));
   }
   

}
