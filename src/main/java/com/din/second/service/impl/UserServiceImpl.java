package com.din.second.service.impl;

import com.din.second.Model.dto.UserDTO;
import com.din.second.Model.entyties.User;
import com.din.second.Model.repositories.UserRepo;
import com.din.second.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public void save(UserDTO userDTO) {
        userRepo.save(toUser(userDTO));
    }
    public User toUser(UserDTO userDTO){
        return User.builder()
                .email(userDTO.getEmail())
                .name(userDTO.getName())
                .id(userDTO.getId())
                .password(userDTO.getPassword())
                .build();
    }
    public UserDTO toUserDTO(User user){
        return UserDTO.builder()
                .id(user.getId())
                .email(user.getEmail())
                .name(user.getName())
                .password(user.getPassword())
                .build();
    }
    @Override
    public User findFirstByEmail(String email) {
        return userRepo.findFirstByEmail(email);
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepo.findAll().stream().map(this::toUserDTO).collect(Collectors.toList());
    }

    @Override
    public User findById(Long id) {
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException("not found User by id"));
    }


}
