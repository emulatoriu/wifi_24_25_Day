package com.emulatoriu.SpringDataUser.logic;

import com.emulatoriu.SpringDataUser.data.User;
import com.emulatoriu.SpringDataUser.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User find(String id) {
        UUID uuid = UUID.fromString(id);
        return userRepository
                .findById(uuid)
                .orElseThrow(RuntimeException::new);
    }

    public User findByFirstname(String firstname) {
        return userRepository.findByFirstname(firstname);
    }
}
