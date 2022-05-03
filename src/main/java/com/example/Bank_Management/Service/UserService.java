package com.example.Bank_Management.Service;

import com.example.Bank_Management.Bean.User;
import com.example.Bank_Management.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUser() {
        List<User> li = new ArrayList<>();
        userRepository.findAll().forEach(x -> li.add(x));
        return li;
    }

    public User getUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
    
    public void deleteAllUser() {
        userRepository.deleteAll();
    }

    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    public void deleteByUserName(String userName) {
        userRepository.deleteByUserName(userName);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }


}
