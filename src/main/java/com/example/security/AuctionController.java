package com.example.security;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuctionController {

    @RequestMapping("/")
    public String index(){
        return "Welcome to our auction!";


    }

    @RequestMapping("/bob")
    public String bob(){
        return "Bob";
    }

    @RequestMapping("/tony")
    public String tony(){
        return "tony";
    }


}
