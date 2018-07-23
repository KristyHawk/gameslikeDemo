package com.gameslike.demo.shared.dto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "TAGS", schema = "DEV")
@Entity
public class TagDTO {

    @Id
    @Column(name = "ID", nullable = false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TAG", nullable = false, length = 50)
    private String tag;

    @ManyToMany(mappedBy = "tagsList")
    private List<GameDTO> gameList = new ArrayList<>();

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

    public List<GameDTO> getGameList() {
        return gameList;
    }

    public void setGameList(List<GameDTO> gameList) {
        this.gameList = gameList;
    }
}
