package com.gameslike.demo.shared.service.impl;

import com.gameslike.demo.server.repositories.repository.UserRepository;
import com.gameslike.demo.shared.dto.UserDTO;
import com.gameslike.demo.shared.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void delete(Integer id) {

    }

    @Override
    public UserDTO findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<UserDTO> findAll() {
        return null;
    }

    @Override
    public void save(UserDTO userDTO) {

    }

    @Override
    public void update(UserDTO userDTO) {

    }

    @Override
    public void add(UserDTO userDTO) {

    }




}
