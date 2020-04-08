package ru.itis.stepan.semestrovaya.repositories;

import ru.itis.stepan.semestrovaya.dto.UserDto;
import ru.itis.stepan.semestrovaya.model.User;

import java.util.List;

public interface UserRepository {
    void add(UserDto user);
    void delete(User user);
    User get(String login, String password);
    List<User> getAll();
    void update(User user);
    User find(long id);
}
