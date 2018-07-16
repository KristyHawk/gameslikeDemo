package com.gameslike.demo.shared.dto;

import javax.persistence.*;

@Table(name = "TAGS", schema = "DETAILS")
@Entity
public class TagDTO {

    @Id
    @Column(name = "ID", nullable = false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TAG", nullable = false, length = 50)
    private String tag;

    @ManyToOne
    private GameDTO game;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public GameDTO getGame() {
        return game;
    }

    public void setGame(GameDTO game) {
        this.game = game;
    }
}
