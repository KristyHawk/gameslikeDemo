package com.gameslike.demo.shared.dto;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "COMMENTS", schema = "DEV")
@Entity
public class CommentDTO {

    @Id
    @Column(name = "ID", nullable = false, length = 30)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CONTENT", nullable = false, length = 5000)
    private String content;

    @Column(name = "CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name = "POSITIVE")
    private boolean positive;

    @Column(name = "LIKES")
    private Integer likes;

    @Column(name = "DISLIKES")
    private Integer dislikes;

    @ManyToOne
    @JoinColumn(name="user_username")
    private UserDTO user;

    @ManyToOne
    @JoinColumn(name="game_id")
    private GameDTO game;

    public boolean isPositive() {
        return positive;
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public GameDTO getGame() {
        return game;
    }

    public void setGame(GameDTO game) {
        this.game = game;
    }
}
