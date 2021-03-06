package com.gameslike.demo.server.repositories.repository;

import com.gameslike.demo.shared.dto.CommentDTO;
import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.dto.TagDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<TagDTO, Integer> {

    @Query("SELECT t FROM TagDTO t JOIN t.gameList g WHERE g.id IN (?1)")
    List<TagDTO> findByGameId(Integer gameId);

}
