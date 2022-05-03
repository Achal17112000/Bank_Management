package com.example.Bank_Management.Bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    int id;

    String name;
    String userName;
    String emailId;
    String address;
    String password;

//    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
//    private List<Account> AccList = new ArrayList<>();
//
//    public List<Account> getAccList() {
//        return AccList;
//    }
//
//    public void setAccList(List<Account> accList) {
//        AccList = accList;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
