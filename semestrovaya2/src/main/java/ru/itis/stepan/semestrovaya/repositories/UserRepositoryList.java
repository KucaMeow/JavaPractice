package ru.itis.stepan.semestrovaya.repositories;

import org.springframework.stereotype.Repository;
import ru.itis.stepan.semestrovaya.dto.UserDto;
import ru.itis.stepan.semestrovaya.models.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryList implements UserRepository{

    List<User> users;
    private static long ids = 0;
    public static final int NICKNAME_MIN_LENGTH = 8;

    public UserRepositoryList() {
        users = new ArrayList<>();
    }

    @Override
    public void add(UserDto user) {
        users.add(User.builder()
                .nickname(user.getNickname())
                .password(user.getPassword())
                .id(ids++)
                .organization_name(user.getOrganization_name())
                .build());
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

    @Override
    public void update(User user) {
        find(user.getId()).setNickname(user.getNickname());
        find(user.getId()).setPassword(user.getPassword());
        find(user.getId()).setOrganization_name(user.getOrganization_name());
    }

    @Override
    public User find(long id) {
        for (User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    private boolean nicknameIsAvailable(UserDto userDto) {
        for(User user : users) {
            if(user.getNickname().equals(userDto.getNickname()))
                return false;
        }
        return true;
    }

    private boolean nicknameHasCorrectLength(UserDto userDto) {
        return userDto.getNickname().length() >= NICKNAME_MIN_LENGTH;
    }

    private boolean passwordIsValid(UserDto userDto) {
        boolean containLetter = userDto.getPassword().matches(".*\\d+.*");
        boolean containDigit = userDto.getPassword().matches(".*[a-zA-Z]+.*");
        return containDigit && containLetter;
    }

    @Override
    public boolean validate(UserDto user) {
        return (nicknameIsAvailable(user) && nicknameHasCorrectLength(user) && passwordIsValid(user));
    }
}
