package com.cuteBrick.javaPractice.service;

import com.cuteBrick.javaPractice.dto.UsersDto;
import com.cuteBrick.javaPractice.entity.Users;

import java.util.List;

public interface UsersService {

    void edit(UsersDto users);

    void authorize(String login, String pass);

    void register(UsersDto users);

    UsersDto getById(long id);

    List<UsersDto> getAll();

    void logOut(UsersDto users);

    List<UsersDto> getByLogin(String login);

    List<UsersDto> getByType(Users.Type type);
}
