package com.gameslike.demo.shared.service.impl;

import com.gameslike.demo.server.repositories.repository.GameRepository;
import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.dto.TagDTO;
import com.gameslike.demo.shared.service.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class GameServiceImpl implements GameService{

    @Autowired
    GameRepository gameRepository;

    @Override
    @Transactional
    public void delete(Integer id) {

    }

    @Override
    @Transactional
    public GameDTO findById(Integer id) {
        return gameRepository.findOne(id);
    }

    @Override
    @Transactional
    public List<GameDTO> findAll() {
        return gameRepository.findAll();
    }

    @Override
    @Transactional
    public void save(GameDTO gameDTO) {
        gameRepository.save(gameDTO);
    }

    @Override
    @Transactional
    public GameDTO findByName(String name) {
        return null;
    }

    @Override
    @Transactional
    public void update(GameDTO gameDTO) {

    }

    @Override
    @Transactional
    public void add(GameDTO gameDTO) {

    }

    @Override
    @Transactional
    public List<GameDTO> findAllAndSortByPopularityRate() {
        List<GameDTO> sortedList = findAll();
        sortedList.sort(new Comparator<GameDTO>() {
            @Override
            public int compare(GameDTO o1, GameDTO o2) {
                if(o1.getPopularity_rating() == o2.getPopularity_rating()) return 0;
                else if(o1.getPopularity_rating() > o2.getPopularity_rating()) return 1;
                else return -1;
            }
        });
        Collections.reverse(sortedList);
        return sortedList;
    }

    @Override
    public List<GameDTO> findAllAndSortByReleaseDate() {
        List<GameDTO> sortedList = findAll();
        sortedList.sort(new Comparator<GameDTO>() {
            @Override
            public int compare(GameDTO o1, GameDTO o2) {
                if(o1.getReleaseDate().before(o2.getReleaseDate())) return -1;
                else if(o1.getReleaseDate().after(o2.getReleaseDate())) return 1;
                else return 0;
            }
        });
        Collections.reverse(sortedList);
        return sortedList;
    }

    @Override
    public List<GameDTO> findRelatedGamesByTags(List<TagDTO> tagsList) {
        String[] tags = tagsList.stream().map(t -> t.getTag()).toArray(size -> new String[size]);
        long length = 1;
        return gameRepository.findRelatedGamesByTags(tags, length);
    }

}
