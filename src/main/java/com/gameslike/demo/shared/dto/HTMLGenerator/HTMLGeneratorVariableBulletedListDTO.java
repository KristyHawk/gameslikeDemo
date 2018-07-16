package com.gameslike.demo.shared.dto.HTMLGenerator;

import com.gameslike.demo.shared.dto.GameDTO;

import javax.persistence.*;

@Table(name = "HTML_GENERATOR_BULLETED_LIST", schema = "DEV")
@Entity
public class HTMLGeneratorVariableBulletedListDTO {

    @Id
    @Column(name = "ID", nullable = false, length = 10)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "BULLETED_STRING", nullable = false, length = 5000)
    private String bulletedString;

    @ManyToOne
    private HTMLGeneratorVariableDTO htmlGeneratorVariableDTO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBulletedString() {
        return bulletedString;
    }

    public void setBulletedString(String bulletedString) {
        this.bulletedString = bulletedString;
    }

    public HTMLGeneratorVariableDTO getHtmlGeneratorVariableDTO() {
        return htmlGeneratorVariableDTO;
    }

    public void setHtmlGeneratorVariableDTO(HTMLGeneratorVariableDTO htmlGeneratorVariableDTO) {
        this.htmlGeneratorVariableDTO = htmlGeneratorVariableDTO;
    }
}
