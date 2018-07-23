package com.gameslike.demo.shared.service.services;

import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.dto.TagDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {

    void delete(Integer id);

    List<TagDTO> findAll();

    void save(TagDTO tagDTO);

    TagDTO findByTag(String tag);

    void update(TagDTO tagDTO);

    void add(TagDTO tagDTO);

    List<TagDTO> findByGameId(Integer id);

}
