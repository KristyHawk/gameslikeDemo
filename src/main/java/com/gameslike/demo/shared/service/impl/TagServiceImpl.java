package com.gameslike.demo.shared.service.impl;

import com.gameslike.demo.server.repositories.repository.TagRepository;
import com.gameslike.demo.shared.dto.TagDTO;
import com.gameslike.demo.shared.service.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService{

    @Autowired
    TagRepository tagRepository;

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<TagDTO> findByGameId(Integer id) {

        return tagRepository.findByGame_Id(id);
    }

    @Override
    public List<TagDTO> findAll() {
        return null;
    }

    @Override
    public void save(TagDTO tagDTO) {

    }

    @Override
    public TagDTO findByTag(String tag) {
        return null;
    }

    @Override
    public void update(TagDTO tagDTO) {

    }

    @Override
    public void add(TagDTO tagDTO) {

    }


}
