package com.gameslike.demo.shared.dto.HTMLGenerator;

import com.gameslike.demo.server.util.RandomUtil;
import com.gameslike.demo.shared.dto.GameDTO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "HTML_GENERATOR", schema = "DEV")
@Entity
public class HTMLGeneratorVariableDTO {

    @Id
    @Column(name = "ID", nullable = false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TYPE", length = 50)
    private String typed;

    @Column(name = "CONTENT", length = 10000)
    private String content; //could be also a picture url in my file system

    @OneToMany(mappedBy = "dto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HTMLGeneratorVariableBulletedListDTO> list = new ArrayList<>();

    @Column(name = "POSITION_ON_PAGE")
    private Integer position;

    @ManyToOne
    private GameDTO game;

    public List<HTMLGeneratorVariableBulletedListDTO> getList() {
        return list;
    }

    public void setList(List<HTMLGeneratorVariableBulletedListDTO> list) {
        this.list = list;
    }

    public HTMLGeneratorVariableDTO() {
        this.id = 1 + (int) (Math.random() * 10000);
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public GameDTO getGame() {
        return game;
    }

    public void setGame(GameDTO game) {
        this.game = game;
    }

    public String getTyped() {
        return typed;
    }

    public void setTyped(String typed) {
        this.typed = typed;
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

}
