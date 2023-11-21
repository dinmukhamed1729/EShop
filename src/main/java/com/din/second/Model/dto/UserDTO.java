package com.din.second.Model.dto;

import com.din.second.Model.entyties.User;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;

}
