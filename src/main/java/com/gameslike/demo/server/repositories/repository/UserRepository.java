package com.gameslike.demo.server.repositories.repository;

import com.gameslike.demo.shared.dto.UserDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDTO, Integer>{
}
