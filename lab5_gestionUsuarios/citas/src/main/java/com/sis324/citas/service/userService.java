package com.sis324.citas.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sis324.citas.model.user;
import com.sis324.citas.repository.userRepository;

@Service
public class userService {

    @Autowired
    userRepository userRepository;

    public ArrayList<user> getUsers() {
        return ((ArrayList<user>) userRepository.findAll());
    }

    public user save(user user) {
        return (userRepository.save(user));
    }

    public boolean delete(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
