package project.service;

import project.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteById(User user);
    User findById(Long id);
    List<User> printUsers();
}
