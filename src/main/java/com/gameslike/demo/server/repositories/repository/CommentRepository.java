package com.gameslike.demo.server.repositories.repository;

import com.gameslike.demo.shared.dto.CommentDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<CommentDTO, Integer> {
}
