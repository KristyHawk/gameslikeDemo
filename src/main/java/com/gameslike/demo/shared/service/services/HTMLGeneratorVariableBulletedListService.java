package com.gameslike.demo.shared.service.services;

import com.gameslike.demo.shared.dto.HTMLGenerator.HTMLGeneratorVariableBulletedListDTO;
import com.gameslike.demo.shared.dto.HTMLGenerator.HTMLGeneratorVariableDTO;

import java.util.List;

public interface HTMLGeneratorVariableBulletedListService {

    void delete(Integer id);

    HTMLGeneratorVariableBulletedListDTO findById(Integer id);

    List<HTMLGeneratorVariableBulletedListDTO> findAll();

    void save(HTMLGeneratorVariableBulletedListDTO dto);

    HTMLGeneratorVariableBulletedListDTO findByName(String name);

    void update(HTMLGeneratorVariableBulletedListDTO dto);

    void add(HTMLGeneratorVariableBulletedListDTO dto);

    void deleteAll();

    List<HTMLGeneratorVariableBulletedListDTO> findByHtmlGeneratorVariableDTO_Id(Integer id);


}
