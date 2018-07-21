package com.gameslike.demo.shared.service.services;

import com.gameslike.demo.shared.dto.HTMLGenerator.HTMLGeneratorVariableBulletedListDTO;
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

    HTMLGeneratorVariableDTO findByGameId(Integer id);

    void saveHTMLGeneratorVariableDTOWithParameter(String[] addedItemsList, HTMLGeneratorVariableDTO dtoo);
}
