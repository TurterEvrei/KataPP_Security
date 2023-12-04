package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.User;

import java.security.Principal;
import java.util.List;

public interface UserService {
    List<User> getListUsers();
    User getUser(Long id);
    User getUser(Principal principal);
    void saveUser(User user);
    void deleteUser(Long id);
}
