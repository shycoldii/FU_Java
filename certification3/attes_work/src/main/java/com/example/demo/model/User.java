package com.example.demo.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users",uniqueConstraints = {@UniqueConstraint(columnNames={"login"})})
public class User {
    public User(){};

    public User(String login,String secondName,String firstName,String patronymic,LocalDate birthday){
        this.login = login;
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthday = birthday;
    }
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date")
    private Date modifyDate;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "login", length = 128, nullable = false)
    private String login;

    @Column(name = "secondName", length = 128, nullable = false)
    private String secondName;

    @Column(name = "firstName", length = 128, nullable = false)
    private String firstName;

    @Column(name = "patronymic", length = 128)
    private String patronymic;

    @Column(name="birthday",length = 60,nullable = false)
    private LocalDate birthday;

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE,mappedBy = "user")
    //@JoinColumn(name = "storeProducts",nullable = false)
    private List<Task> tasks;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
