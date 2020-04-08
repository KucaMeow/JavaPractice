package ru.itis.stepan.semestrovaya.repositories;

import org.springframework.stereotype.Repository;
import ru.itis.stepan.semestrovaya.dto.UserDto;
import ru.itis.stepan.semestrovaya.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepositoryList implements UserRepository{

    List<User> users;
    private static long ids = 0;

    public UserRepositoryList() {
        users = new ArrayList<>();
    }

    @Override
    public void add(UserDto user) {
        users.add(User.builder().nickname(user.getNickname()).password(user.getPassword()).id(ids++).build());
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }

    @Override
    public User get(String login, String password) {
        for (User user : users) {
            if(user.getNickname().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(users);
    }
}
