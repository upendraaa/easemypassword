package com.example.easemypassword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    @GetMapping("/demo")
    public String getDemoData(){

        return "Demo Data";
    }



}
