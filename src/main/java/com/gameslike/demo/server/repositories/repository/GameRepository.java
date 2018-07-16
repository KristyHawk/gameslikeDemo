package com.gameslike.demo.server.repositories.repository;

import com.gameslike.demo.shared.dto.GameDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<GameDTO, Integer> {

}
