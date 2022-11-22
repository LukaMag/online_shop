package com.example.demo.controllers;

import com.example.demo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/shoes")
@RequiredArgsConstructor
public class UserController {
    @GetMapping
    public List<User> getShoes(){
        return Collections.EMPTY_LIST;
    }
}
