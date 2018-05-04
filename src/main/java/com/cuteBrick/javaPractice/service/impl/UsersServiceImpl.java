package com.cuteBrick.javaPractice.service.impl;

import com.cuteBrick.javaPractice.dao.UsersDao;
import com.cuteBrick.javaPractice.dto.UsersDto;
import com.cuteBrick.javaPractice.entity.Users;
import com.cuteBrick.javaPractice.service.UsersService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{

    ModelMapper mm = new ModelMapper();

    @Autowired
    UsersDao usersDao;

    @Override
    public void edit(UsersDto users) {
        Users getbyId = usersDao.getbyId(users.getId());
        Users map = mm.map(getbyId, Users.class);
        if (getbyId != null){
            usersDao.update(map);
        }
    }

    @Override
    public void authorize(String login, String pass) {
        //TBD
    }

    @Override
    public void register(UsersDto users) {
        Users map = mm.map(users, Users.class);
        usersDao.save(map);
    }

    @Override
    public UsersDto getById(long id) {
        Users users = usersDao.getbyId(id);
        return mm.map(users, UsersDto.class);
    }

    @Override
    public List<UsersDto> getAll() {
        List<Users> allUsers = usersDao.getAllUsers();
        ListUsersDto map = mm.map(allUsers, ListUsersDto.class);
        return map;
    }

    @Override
    public void logOut(UsersDto users) {
        //TBD
    }

    @Override
    public List<UsersDto> getByLogin(String login) {
        //TBD
        return null;
    }

    @Override
    public List<UsersDto> getByType(Users.Type type) {
        //TBD
        return null;
    }

    private class ListUsersDto extends ArrayList<UsersDto>{

    }
}
