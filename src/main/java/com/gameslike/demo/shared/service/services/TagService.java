package com.gameslike.demo.shared.service.services;

import com.gameslike.demo.shared.dto.TagDTO;

import java.util.List;

public interface TagService {

    void delete(Integer id);

    List<TagDTO> findByGameId(Integer id);

    List<TagDTO> findAll();

    void save(TagDTO tagDTO);

    TagDTO findByTag(String tag);

    void update(TagDTO tagDTO);

    void add(TagDTO tagDTO);

}
