package com.gameslike.demo.server.repositories.repository;

import com.gameslike.demo.shared.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends CrudRepository<UserDTO, Integer>{

    UserDTO findByUsername(String username);
}
