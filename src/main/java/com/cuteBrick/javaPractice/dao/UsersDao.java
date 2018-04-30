package com.cuteBrick.javaPractice.dao;

import com.cuteBrick.javaPractice.entity.Users;

import java.util.List;

public interface UsersDao {

    Users getbyId(long id);

    void save(Users users);

    void update(Users users);

    void delete(Users users);

    List<Users> getAllUsers();
}
