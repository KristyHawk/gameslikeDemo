package com.gameslike.demo.shared.service.services;

import com.gameslike.demo.shared.dto.HTMLDescription.HTMLDescriptionDTO;

import java.util.List;

public interface HTMLDescriptionService {

    void delete(Integer id);

    HTMLDescriptionDTO findById(Integer id);

    List<HTMLDescriptionDTO> findAll();

    void save(HTMLDescriptionDTO htmlDescriptionDTO);

    void updateContent(Integer id, String content);

    void add(HTMLDescriptionDTO htmlDescriptionDTO);

    HTMLDescriptionDTO findByCode(String code);
}
