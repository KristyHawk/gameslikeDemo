package com.gameslike.demo.shared.service.impl;

import com.gameslike.demo.server.repositories.repository.HTMLGeneratorVariableBulletedListRepository;
import com.gameslike.demo.server.repositories.repository.HTMLGeneratorVariableRepository;
import com.gameslike.demo.shared.dto.HTMLGenerator.HTMLGeneratorVariableBulletedListDTO;
import com.gameslike.demo.shared.dto.HTMLGenerator.HTMLGeneratorVariableDTO;
import com.gameslike.demo.shared.service.services.HTMLGeneratorVariableBulletedListService;
import com.gameslike.demo.shared.service.services.HTMLGeneratorVariableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HTMLGeneratorVariableServiceImpl implements HTMLGeneratorVariableService{

    @Autowired
    HTMLGeneratorVariableRepository htmlRepository;

    @Autowired
    HTMLGeneratorVariableBulletedListService htmlGeneratorVariableBulletedListService;


    @Override
    public void delete(Integer id) {
        htmlRepository.delete(id);
    }

    @Override
    public HTMLGeneratorVariableDTO findById(Integer id) {
        return null;
    }

    @Override
    public List<HTMLGeneratorVariableDTO> findAll() {
        return htmlRepository.findAll();
    }

    @Override
    @Transactional
    public void save(HTMLGeneratorVariableDTO htmlGeneratorVariableDTO) {
        htmlRepository.save(htmlGeneratorVariableDTO);
    }

    @Override
    public HTMLGeneratorVariableDTO findByName(String name) {
        return null;
    }

    @Override
    public void update(HTMLGeneratorVariableDTO htmlGeneratorVariableDTO) {

    }

    @Override
    public void add(HTMLGeneratorVariableDTO htmlGeneratorVariableDTO) {

    }

    @Override
    public void deleteAll() {
        htmlRepository.deleteAll();
    }

    @Override
    public String textToHTMLDiv() {
        StringBuilder sb = new StringBuilder(); //Пишу это перед тем, как начать писать этот метод... Да благословит меня бог программистов
        List<HTMLGeneratorVariableDTO> htmlList = htmlRepository.findAll();

        return null;
    }

    @Override
    public HTMLGeneratorVariableDTO findByGameId(Integer id) {
        return htmlRepository.findByGame_Id(id);
    }


    @Override
    @Transactional
    public void saveHTMLGeneratorVariableDTOWithParameter(String[] addedItemsList, HTMLGeneratorVariableDTO dtoo) {

        Arrays.stream(addedItemsList).map(v -> new HTMLGeneratorVariableBulletedListDTO(addedItemsList[0], dtoo)).forEach(v -> htmlGeneratorVariableBulletedListService.save(v));

    }
}
