package com.din.second.Model.repositories;


import com.din.second.Model.entyties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    User findFirstByEmail(String email);

    Optional<User> findById(Long id);

}
