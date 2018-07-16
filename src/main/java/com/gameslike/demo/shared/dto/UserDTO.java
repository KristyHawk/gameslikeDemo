package com.gameslike.demo.shared.dto;

import javax.persistence.*;
import java.util.List;

@Table(name = "USERS", schema = "USER_AUTHORIZATION")
@Entity
public class UserDTO {

    @Id
    @Column(name = "ID", nullable = false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "LOGIN", nullable = false, length = 50)
    private String login;

    @Column(name = "PASSWORD", nullable = false, length = 100)
    private String password;

    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "SECOND_NAME", length = 100)
    private String secondName;

    @Column(name = "PATRONYMIC")
    private String patronymic;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CITY")
    private String city;

    @ManyToMany(mappedBy = "users") //TODO добавить в GameDTO список юзеров, которые владеют этой игрой (как раз так можно определять рейтинг игры)
    private List<GameDTO> gamesList;

    @OneToMany(mappedBy = "user") //TODO добавить в CommentDTO User user, который является владельцем коммента (потом можно сделать страницу со всеми комментами юзера, чтобы он мог переходить по всем постам, где он оставлял комменты)
    private List<CommentDTO> commentsList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<GameDTO> getGamesList() {
        return gamesList;
    }

    public void setGamesList(List<GameDTO> gamesList) {
        this.gamesList = gamesList;
    }

    public List<CommentDTO> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<CommentDTO> commentsList) {
        this.commentsList = commentsList;
    }
}
