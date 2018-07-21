package com.gameslike.demo.server.repositories.repository;

import com.gameslike.demo.shared.dto.HTMLDescription.HTMLDescriptionDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HTMLDescriptionRepository extends JpaRepository<HTMLDescriptionDTO, Integer> {

    HTMLDescriptionDTO findByCode(String code);
}
