package com.example.demo;

import java.time.LocalDate;

public class News {
    private final Long id;
    private final String title;
    private final String name;
    private final String surname;
    private final String patronymic;
    private final LocalDate date;
    private final LocalDate update;
    private final String text;
    private final String category;

    News(Long id, String title, String name, String surname, String patronymic,
         LocalDate date, LocalDate update, String text,
         String category){
        this.id = id;
        this.title = title;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.date = date;
        this.update = update;
        this.text = text;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getUpdate() {
        return update;
    }

    public String getText() {
        return text;
    }

    public String getCategory() {
        return category;
    }
}
