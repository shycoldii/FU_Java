package com.example.demo;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("news")
public class Сontroller {

    private List<News> list;

    @GetMapping("/get/{id}")
    public ResponseEntity<News> get(@PathVariable Long id) {
      try{
            for(News i: this.list){
                Long myid = i.getId();
                if(myid.equals(id)){
                    return new ResponseEntity<>(i,HttpStatus.OK);
                }
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/post")
    ResponseEntity<Boolean> createNews (@RequestParam Long id,@RequestParam String title, @RequestParam String name,
                                        @RequestParam String surname, @RequestParam String patronymic,
                                        @RequestParam LocalDate date, @RequestParam LocalDate update,
                                        @RequestParam String text,@RequestParam String category
                                        ) {

        try{
            this.list.add(new News(id,title,name,surname,patronymic,date,update,text,category));
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
        }
    }
    @DeleteMapping("/delete/{id}")
    ResponseEntity<Boolean> delete(Long id){
        try{
            int r = -1;
            for(News i: this.list){
                Long myid = i.getId();
                if(myid.equals(id)){
                    r = this.list.indexOf(i);
                }
            }
            if(r!=-1){
                this.list.remove(r);
                return new ResponseEntity<>(true,HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/put")
    ResponseEntity<Boolean> putNews (@RequestParam Long id,@RequestParam String title, @RequestParam String name,
                                        @RequestParam String surname, @RequestParam String patronymic,
                                        @RequestParam LocalDate date, @RequestParam LocalDate update,
                                        @RequestParam String text,@RequestParam String category
    ) {

         try{
            int r = -1;
            for(News i: this.list){
                Long myid = i.getId();
                if(myid.equals(id)){
                    r = this.list.indexOf(i);
                }
            }
            if(r!=-1){
                this.list.remove(r);
                this.list.add(new News(id,title,name,surname,patronymic,date,update,text,category));
                return new ResponseEntity<>(true,HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
