package com.example.Bank_Management.Repository;

import com.example.Bank_Management.Bean.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
