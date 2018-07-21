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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dto_id", nullable = false)
    private HTMLGeneratorVariableDTO dto;

    public HTMLGeneratorVariableBulletedListDTO(String bulletedString, HTMLGeneratorVariableDTO dto) {
        this.bulletedString = bulletedString;
        this.dto = dto;
    }

    public HTMLGeneratorVariableBulletedListDTO() {
        this.id = 1 + (int) (Math.random() * 10000);
    }

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

    public HTMLGeneratorVariableDTO getDto() {
        return dto;
    }

    public void setDto(HTMLGeneratorVariableDTO dto) {
        this.dto = dto;
    }
}
