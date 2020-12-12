import models.*;
import services.*;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        //инициализируем все сервисы
        User_service userService = new User_service();
        Test_service testService = new Test_service();
        Test_list_service testListService = new Test_list_service();
        Student_answer_service studentAnswer = new Student_answer_service();
        Role_service roleService = new Role_service();
        Group_service groupService = new Group_service();
        Question_service questionService = new Question_service();
        Answer_service answerService = new Answer_service();
        Schedule_service scheduleService = new Schedule_service();
        Subject_service subjectService = new Subject_service();

       //добавляем данные в базу данных

        Question question1 = new Question("Кто купил книгу?", 3, true);
        Question question2 = new Question("Чему равно число pi?", 3, true);
        Question question3 = new Question("Зачем нам это?", 3, true);
        questionService.saveQuestion(question1);
        questionService.saveQuestion(question2);
        questionService.saveQuestion(question3);

        Answer answer1 = new Answer("1", true);
        Answer answer2 = new Answer("2", false);
        Answer answer3 = new Answer("3", true);
        Answer answer4 = new Answer("4", true);
        Answer answer5 = new Answer("5", false);

        answerService.saveAnswer(answer1);
        answerService.saveAnswer(answer2);
        answerService.saveAnswer(answer3);
        answerService.saveAnswer(answer4);
        answerService.saveAnswer(answer5);

        Role student = new Role("Студент");
        Role teacher = new Role("Преподаватель");
        User user1 = new User("Александрова", "Дарья",
                "Игоревна", "dasha", "123");
        user1.setRole(student);
        User teacher1 = new User("Милованов", "Даниил", "Михайлович", "milovanov", "456");
        teacher1.setRole(teacher);
        userService.saveUser(user1);
        userService.saveUser(teacher1);

        System.out.println(userService.getTeachers());
        System.out.println(userService.getStudents());
    }
}
