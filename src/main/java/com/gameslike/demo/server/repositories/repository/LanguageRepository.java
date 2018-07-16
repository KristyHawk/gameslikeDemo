package com.gameslike.demo.server.repositories.repository;

import com.gameslike.demo.shared.dto.LanguageDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends CrudRepository<LanguageDTO, Integer>{
}
