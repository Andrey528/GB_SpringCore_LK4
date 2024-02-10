package com.example.GB_SpringCore_LK4.sevices;

import com.example.GB_SpringCore_LK4.models.User;
import com.example.GB_SpringCore_LK4.repository.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        userRepository.save(new User(null, "Evgeny", "evgeny@example.com"));
        userRepository.save(new User(null, "Andrey", "andrey@example.com"));
        userRepository.save(new User(null, "Dmitry", "dmitry@example.com"));
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }
}
