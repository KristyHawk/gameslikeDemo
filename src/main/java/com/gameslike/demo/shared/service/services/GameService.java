package com.gameslike.demo.shared.service.services;

import com.gameslike.demo.shared.dto.GameDTO;

import java.util.List;

public interface GameService {

    void delete(Integer id);

    GameDTO findById(Integer id);

    List<GameDTO> findAll();

    void save(GameDTO gameDTO);

    GameDTO findByName(String name);

    void update(GameDTO gameDTO);

    void add(GameDTO gameDTO);

    List<GameDTO> findAllAndSortByPopularityRate();
}
