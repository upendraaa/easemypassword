package com.example.easemypassword.controllers;

import com.example.easemypassword.model.Account;
import com.example.easemypassword.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/data/{id}")
    public Account getAccountById(@PathVariable("id") int id){
        return accountService.findAccountById(id);
    }

    @PostMapping("/data/")
    public void saveAccount(@RequestBody Account account){
        accountService.saveOrUpdate(account);
    }

    @GetMapping("/data/accounts")
    public List<Account> getAllAccounts(){

        return accountService.findAllAccounts();
    }



}
