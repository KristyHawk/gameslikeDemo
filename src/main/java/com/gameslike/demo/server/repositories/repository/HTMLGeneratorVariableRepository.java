package com.gameslike.demo.server.repositories.repository;

import com.gameslike.demo.shared.dto.HTMLGenerator.HTMLGeneratorVariableDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HTMLGeneratorVariableRepository extends JpaRepository<HTMLGeneratorVariableDTO, Integer> {

    void deleteAll();
    HTMLGeneratorVariableDTO findByGame_Id(Integer id);

}
