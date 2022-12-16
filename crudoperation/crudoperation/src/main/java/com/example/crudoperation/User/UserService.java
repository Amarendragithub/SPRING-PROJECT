package com.example.crudoperation.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    public List<User> listall(){
        return (List<User>)repo.findAll();
    }
}



