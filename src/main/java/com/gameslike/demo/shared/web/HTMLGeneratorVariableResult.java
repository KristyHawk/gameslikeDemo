package com.gameslike.demo.shared.web;

import com.gameslike.demo.shared.dto.HTMLGenerator.HTMLGeneratorVariableDTO;

import java.util.List;

public class HTMLGeneratorVariableResult {

    private List<HTMLGeneratorVariableDTO> htmlDTOList;

    public HTMLGeneratorVariableResult() {
    }

    public HTMLGeneratorVariableResult(List<HTMLGeneratorVariableDTO> htmlDTOList) {
        this.htmlDTOList = htmlDTOList;
    }

    public List<HTMLGeneratorVariableDTO> getHtmlDTOList() {
        return htmlDTOList;
    }

    public void setHtmlDTOList(List<HTMLGeneratorVariableDTO> htmlDTOList) {
        this.htmlDTOList = htmlDTOList;
    }
}
