package com.example.easemypassword.service;

import com.example.easemypassword.model.Account;
import com.example.easemypassword.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Account findAccountById(int id){
        return accountRepository.findById(id).get();
    }

    public List<Account> findAllAccounts(){
        List<Account> accounts = new ArrayList<Account>();
        accountRepository.findAll().forEach(employee -> accounts.add(employee));
        return accounts;
    }


    public void saveOrUpdate(Account account){
        accountRepository.save(account);
    }


    public void deleteByAccountId(int accountId){
        accountRepository.deleteById(accountId);
    }

    public long getCounts(){
        return  accountRepository.count();
    }




}
