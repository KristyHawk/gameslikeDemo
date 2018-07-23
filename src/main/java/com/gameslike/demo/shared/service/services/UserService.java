package com.gameslike.demo.shared.service.services;

import com.gameslike.demo.shared.dto.UserDTO;

import java.util.List;

public interface UserService {

    void delete(Integer id);

    UserDTO findByUsername(String username);

    List<UserDTO> findAll();

    void save(UserDTO userDTO);

    void update(UserDTO userDTO);

    void add(UserDTO userDTO);
}
