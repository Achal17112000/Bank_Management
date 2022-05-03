package com.example.Bank_Management.Repository;

import com.example.Bank_Management.Bean.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUserName(String userName);

    void deleteByUserName(String userName);
}
