package com.bspring.backend.service;

import com.bspring.backend.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DefaultUserService implements UserService {
    @Override
    public List<User> findAll() {
        return Arrays.asList(User.builder().build());
    }

    @Override
    public User save(User user) {
        return User.builder().build();
    }
}
