package com.bspring.backend.handler;

import com.bspring.backend.model.User;
import com.bspring.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Supplier;

@Component("getAllUsers")
@RequiredArgsConstructor
public class GetAllUsersHandler implements Supplier<List<User>> {
    private final UserService userService;

    @Override
    public List<User> get() {
        return userService.findAll();
    }
}
