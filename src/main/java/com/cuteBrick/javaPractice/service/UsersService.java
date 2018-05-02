package com.cuteBrick.javaPractice.service;

import com.cuteBrick.javaPractice.entity.Users;

import java.util.List;

public interface UsersService {

    void create(Users users);

    void delete(Users users);

    void update(Users users);

    void authorize(String login, String pass);

    void register(Users users);

    Users getById(long id);

    List<Users> getAll();

    void logOut(Users users);

    List<Users> getByLogin(String login);

    List<Users> getByType(String type);
}
