package com.gameslike.demo.shared.service.services;

import com.gameslike.demo.shared.dto.CommentDTO;
import com.gameslike.demo.shared.dto.GameDTO;

import java.util.List;

public interface CommentService {

    void delete(Integer id);

    GameDTO findById(Integer id);

    List<GameDTO> findAll();

    void save(GameDTO gameDTO);

    GameDTO findByName(String name);

    void update(GameDTO gameDTO);

    void add(GameDTO gameDTO);

    List<CommentDTO> findAllByGameId(Integer id);
}
