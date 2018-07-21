package com.gameslike.demo.shared.dto.HTMLDescription;

import com.gameslike.demo.shared.dto.GameDTO;

import javax.persistence.*;

@Table(name = "html_description", schema = "DETAILS")
@Entity
public class HTMLDescriptionDTO {

    @Id
    @Column(name = "ID", nullable = false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CODE", nullable = false, length = 8)
    private String code;

    @Column(name = "CONTENT")
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
