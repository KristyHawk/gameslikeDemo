package com.gameslike.demo.shared.service.services;

import com.gameslike.demo.shared.dto.HTMLGenerator.HTMLGeneratorVariableDTO;

import java.util.List;

public interface HTMLGeneratorVariableService {

    void delete(Integer id);

    HTMLGeneratorVariableDTO findById(Integer id);

    List<HTMLGeneratorVariableDTO> findAll();

    void save(HTMLGeneratorVariableDTO htmlGeneratorVariableDTO);

    HTMLGeneratorVariableDTO findByName(String name);

    void update(HTMLGeneratorVariableDTO htmlGeneratorVariableDTO);

    void add(HTMLGeneratorVariableDTO htmlGeneratorVariableDTO);

    void deleteAll();

    String textToHTMLDiv();

    List<HTMLGeneratorVariableDTO> findByGameId(Integer id);
}
