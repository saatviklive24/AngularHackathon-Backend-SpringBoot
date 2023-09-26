package com.example.Natwest.User.repository;

import com.example.Natwest.User.Model.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Userinfo, Integer> {

}
