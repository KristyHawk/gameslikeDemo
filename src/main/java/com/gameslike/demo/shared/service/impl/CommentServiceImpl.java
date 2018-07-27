package com.gameslike.demo.shared.service.impl;

import com.gameslike.demo.server.repositories.repository.CommentRepository;
import com.gameslike.demo.shared.dto.CommentDTO;
import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.service.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;


    @Override
    public void delete(Integer id) {

    }

    @Override
    public GameDTO findById(Integer id) {
        return null;
    }

    @Override
    public List<GameDTO> findAll() {
        return null;
    }

    @Override
    public void save(GameDTO gameDTO) {

    }

    @Override
    public GameDTO findByName(String name) {
        return null;
    }

    @Override
    public void update(GameDTO gameDTO) {

    }

    @Override
    public void add(GameDTO gameDTO) {

    }

    @Override
    public List<CommentDTO> findAllByGameId(Integer id) {
        return commentRepository.findAllByGameId(id);
    }
}
