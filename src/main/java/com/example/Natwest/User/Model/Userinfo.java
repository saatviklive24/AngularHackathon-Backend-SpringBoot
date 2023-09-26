package com.example.Natwest.User.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Userinfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Userinfo {

    @Id    //@Id here indicates primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String name;
    private String address ;
    private String accountNo;
    private String mobileNo;
    private String password;
}
