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
    public CommentDTO findById(Integer id) {
        return commentRepository.findOne(id);
    }

    @Override
    public List<CommentDTO> findAll() {
        return null;
    }

    @Override
    public void save(CommentDTO comment) {
        commentRepository.save(comment);
    }

    @Override
    public CommentDTO findByName(String name) {
        return null;
    }

    @Override
    public void update(CommentDTO commentDTO) {

    }

    @Override
    public void add(CommentDTO comment) {
        commentRepository.save(comment);
    }

    @Override
    public List<CommentDTO> findAllByGameId(Integer id) {
        return commentRepository.findAllByGameId(id);
    }
}
