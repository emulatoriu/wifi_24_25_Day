package com.emulatoriu.SpringDataUser.repository;

import com.emulatoriu.SpringDataUser.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByFirstname(String firstname);
}
