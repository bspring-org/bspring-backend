package com.bspring.backend.handler;

import com.bspring.backend.model.User;
import com.bspring.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("saveUser")
@RequiredArgsConstructor
public class SaveUserHandler implements Function<User, User> {
    private final UserService userService;

    @Override
    public User apply(User user) {
        return userService.save(user);
    }
}
