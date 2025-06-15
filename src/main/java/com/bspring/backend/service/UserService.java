package com.bspring.backend.service;

import com.bspring.backend.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User save(User user);
}
