package com.example.Bank_Management.Service;

import com.example.Bank_Management.Bean.Account;
import com.example.Bank_Management.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    public List<Account> getAccounts() {
        List<Account> accountList = new ArrayList<>();
        accountRepository.findAll().forEach(x -> accountList.add(x));
        return accountList;
    }

    public Account getAccountAccNo(long id) {
        return accountRepository.findById(id).get();
    }

    public Account updateAcc(Account account) {
        return accountRepository.save(account);
    }

    public void deleteAcc(Account account) {
        accountRepository.delete(account);
    }

    public void deleteByAccNo(long accNo) {
        accountRepository.deleteById(accNo);
    }
}
