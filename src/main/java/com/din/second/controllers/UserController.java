package com.din.second.controllers;

import com.din.second.Model.dto.UserDTO;
import com.din.second.Model.entyties.User;
import com.din.second.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {
    private final UserService userService;

    @GetMapping("")
    public List<UserDTO> getAllUsers(){
        return userService.findAll();
    }
    @GetMapping("/{id}")
    public User getUerById(@PathVariable Long id){
        return userService.findById(id);
    }

     @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDTO userDTO){
        System.out.println(userDTO.getEmail()  + " " + userDTO.getName() + " " + userDTO.getPassword());
        var user = userService.findFirstByEmail(userDTO.getEmail());
        if(user == null)
            throw  new IllegalArgumentException("user not found ");

        if(!user.getPassword().equals(userDTO.getPassword()) || !user.getName().equals(userDTO.getName())){
            throw new IllegalArgumentException("not equals arguments");
        }
        return ResponseEntity.ok("200");
    }
    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody UserDTO userDTO){
        userService.save(userDTO);
        return ResponseEntity.ok("200");
    }

}
