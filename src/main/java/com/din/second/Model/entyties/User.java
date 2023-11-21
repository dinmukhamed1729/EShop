package com.din.second.Model.entyties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String email;
    private boolean archive;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToOne(mappedBy = "user",cascade = CascadeType.REMOVE)
    private Bucket bucket;
    @Column(name ="activate_code")
    private String activateCode;
}
