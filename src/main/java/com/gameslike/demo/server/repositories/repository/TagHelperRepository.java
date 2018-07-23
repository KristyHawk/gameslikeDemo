package com.gameslike.demo.server.repositories.repository;

import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.dto.TagDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TagHelperRepository extends PagingAndSortingRepository<TagDTO, Integer>{

    @Query("select t from TagDTO t join t.gameList g where g.id = :gameId")
    List<TagDTO> findByGameId(Pageable pageable, @Param("gameId") Integer gameId);
}
