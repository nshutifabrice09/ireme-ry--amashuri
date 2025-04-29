package com.backend.ireme_ry._amashuri.service;

import com.backend.ireme_ry._amashuri.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user);
    User updateUser(Long id, User user);
    void deleteUserById(Long id);
}
