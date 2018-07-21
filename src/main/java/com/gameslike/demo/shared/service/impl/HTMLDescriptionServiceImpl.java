package com.gameslike.demo.shared.service.impl;

import com.gameslike.demo.server.repositories.repository.HTMLDescriptionRepository;
import com.gameslike.demo.shared.dto.HTMLDescription.HTMLDescriptionDTO;
import com.gameslike.demo.shared.service.services.HTMLDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.OneToOne;
import java.util.List;

@Service
public class HTMLDescriptionServiceImpl implements HTMLDescriptionService{

    @Autowired
    HTMLDescriptionRepository htmlDescriptionRepository;

    @Override
    public void delete(Integer id) {

    }

    @Override
    public HTMLDescriptionDTO findById(Integer id) {
        return htmlDescriptionRepository.findOne(id);
    }

    @Override
    public List<HTMLDescriptionDTO> findAll() {
        return htmlDescriptionRepository.findAll();
    }

    @Override
    public void save(HTMLDescriptionDTO htmlDescriptionDTO) {
        htmlDescriptionRepository.save(htmlDescriptionDTO);
    }

    @Override
    public void updateContent(Integer id, String content) {
        HTMLDescriptionDTO targetDTO = findById(id);
        targetDTO.setContent(content);
        save(targetDTO);
    }

    @Override
    public void add(HTMLDescriptionDTO htmlDescriptionDTO) {

    }

    @Override
    public HTMLDescriptionDTO findByCode(String code) {
        return htmlDescriptionRepository.findByCode(code);
    }
}
