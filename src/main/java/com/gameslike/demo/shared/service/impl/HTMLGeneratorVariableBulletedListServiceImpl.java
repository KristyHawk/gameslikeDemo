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

import java.util.List;

@Service
public class HTMLGeneratorVariableBulletedListServiceImpl implements HTMLGeneratorVariableBulletedListService{

    @Autowired
    HTMLGeneratorVariableBulletedListRepository htmlGeneratorVariableBulletedListRepository;


    @Override
    public void delete(Integer id) {

    }

    @Override
    public HTMLGeneratorVariableBulletedListDTO findById(Integer id) {
        return null;
    }

    @Override
    public List<HTMLGeneratorVariableBulletedListDTO> findAll() {
        return null;
    }

    @Override
    @Transactional
    public void save(HTMLGeneratorVariableBulletedListDTO dto) {
        htmlGeneratorVariableBulletedListRepository.save(dto);
    }

    @Override
    public HTMLGeneratorVariableBulletedListDTO findByName(String name) {
        return null;
    }

    @Override
    public void update(HTMLGeneratorVariableBulletedListDTO dto) {

    }

    @Override
    public void add(HTMLGeneratorVariableBulletedListDTO dto) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<HTMLGeneratorVariableBulletedListDTO> findByHtmlGeneratorVariableDTO_Id(Integer id) {
        return htmlGeneratorVariableBulletedListRepository.findByDto_Id(id);
    }
}
