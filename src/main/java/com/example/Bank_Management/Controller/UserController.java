package com.example.Bank_Management.Controller;

import com.example.Bank_Management.Bean.User;
import com.example.Bank_Management.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getAllUser")
    List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/getUserById/{userid}")
    User getUserById(@PathVariable("userid") int userid) {
        return userService.getUserById(userid);
    }

    @GetMapping("/getUserByUserName/{userName}")
    User getUserByUserName(@PathVariable("userName") String userName) {
        return userService.getUserByUserName(userName);
    }

    @PutMapping("/updateUser")
    User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser")
    void deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
    }

    @DeleteMapping("/deleteUserById/{userid}")
    void deleteUserById(@PathVariable("userid") int userId) {
        userService.deleteById(userId);
    }

    @DeleteMapping("/deleteAllUser")
    void deleteAllUser() {
        userService.deleteAllUser();
    }

    @DeleteMapping("/deleteByUserName/{userName}")
    void deleteByUserName(@PathVariable("userName") String userName) {
        userService.deleteByUserName(userName);
    }
}
