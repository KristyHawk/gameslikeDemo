package com.gameslike.demo.server.repositories.repository;

import com.gameslike.demo.shared.dto.GameDTO;
import com.gameslike.demo.shared.dto.TagDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<GameDTO, Integer> {

    @Query("select g from GameDTO g join g.tagsList t where t.tag in (:tags) group by g having count(t) = :tag_count ")
    List<GameDTO> findRelatedGamesByTags(@Param("tags") String[] tags, @Param("tag_count") Long length);
}
