package com.din.second.service;

import com.din.second.Model.dto.UserDTO;
import com.din.second.Model.entyties.User;

import java.util.List;


public interface UserService {
    public void save(User user);
    public void save(UserDTO userDTO);
    User findFirstByEmail(String email);

    List<UserDTO> findAll();

    User findById(Long id);
}
