package com.gameslike.demo.server.repositories.repository;

import com.gameslike.demo.shared.dto.HTMLGenerator.HTMLGeneratorVariableBulletedListDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HTMLGeneratorVariableBulletedListRepository extends JpaRepository<HTMLGeneratorVariableBulletedListDTO, Integer> {

    List<HTMLGeneratorVariableBulletedListDTO> findByDto_Id(Integer id);
}
