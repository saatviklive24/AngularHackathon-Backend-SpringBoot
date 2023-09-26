package com.example.Natwest.User.Controller;

import com.example.Natwest.User.Model.Userinfo;
import com.example.Natwest.User.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserServices employeeServices;

    @PostMapping("/adduser")
    public Userinfo addUser(@RequestBody Userinfo employee) {
        return employeeServices.addUser(employee);
    }

    @GetMapping("/getuser")
    public List<Userinfo> getUsers(){
        return employeeServices.getUsers();
    }


}
