package com.example.Natwest.User.Service;

import com.example.Natwest.User.Model.Userinfo;
import com.example.Natwest.User.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    UserRepo userRepo;
    public Userinfo addUser(Userinfo employee) {
        return userRepo.save(employee);
    }

    public List<Userinfo> getUsers() {
        return userRepo.findAll();
    }
}
