package ru.itmentor.spring.boot_security.demo.service;


import ru.itmentor.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {

    void createUser(User user);

    User getUserById(long id);

    User getUserByEmail(String email);

    List<User> getAllUsers();

    void updateUser(User user);

    void deleteUserById(long id);
}
