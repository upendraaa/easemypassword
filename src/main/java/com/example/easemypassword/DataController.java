package com.example.easemypassword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/data")
public class DataController {

    @GetMapping("/demo")
    public String getDemoData(){

        BigInteger b = new BigInteger("123");

        return "Demo Data";
    }



}
