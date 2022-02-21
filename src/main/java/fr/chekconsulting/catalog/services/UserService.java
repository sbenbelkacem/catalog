package fr.chekconsulting.catalog.services;


import fr.chekconsulting.catalog.entities.User;
import fr.chekconsulting.catalog.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
