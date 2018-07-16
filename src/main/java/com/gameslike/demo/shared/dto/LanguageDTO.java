package com.gameslike.demo.shared.dto;

import javax.persistence.*;

@Table(name = "LANGUAGES", schema = "DETAILS")
@Entity
public class LanguageDTO {

    @Id
    @Column(name = "ID", nullable = false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "LANGUAGE", nullable = false, length = 50)
    private String language;

    @ManyToOne
    private GameDTO game;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public GameDTO getGame() {
        return game;
    }

    public void setGame(GameDTO game) {
        this.game = game;
    }
}
