package com.gameslike.demo.shared.service.services;

import com.gameslike.demo.shared.dto.CommentDTO;
import com.gameslike.demo.shared.dto.GameDTO;

import java.util.List;

public interface CommentService {

    void delete(Integer id);

    CommentDTO findById(Integer id);

    List<CommentDTO> findAll();

    void save(CommentDTO comment);

    CommentDTO findByName(String name);

    void update(CommentDTO commentDTO);

    void add(CommentDTO comment);

    List<CommentDTO> findAllByGameId(Integer id);
}
