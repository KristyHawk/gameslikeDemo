package com.gameslike.demo.server.repositories.repository;

import com.gameslike.demo.shared.dto.CommentDTO;
import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.dto.TagDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<TagDTO, Integer> {

    List<TagDTO> findByGame_Id(Integer id);

}
