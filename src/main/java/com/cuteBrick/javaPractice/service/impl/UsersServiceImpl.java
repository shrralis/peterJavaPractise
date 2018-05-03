package com.cuteBrick.javaPractice.service.impl;

import com.cuteBrick.javaPractice.entity.Users;
import com.cuteBrick.javaPractice.service.UsersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{

    @Override
    public void edit(Users users) {

    }

    @Override
    public void authorize(String login, String pass) {

    }

    @Override
    public void register(Users users) {

    }

    @Override
    public Users getById(long id) {
        return null;
    }

    @Override
    public List<Users> getAll() {
        return null;
    }

    @Override
    public void logOut(Users users) {

    }

    @Override
    public List<Users> getByLogin(String login) {
        return null;
    }

    @Override
    public List<Users> getByType(String type) {
        return null;
    }
}
