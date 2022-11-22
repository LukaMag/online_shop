package com.example.demo.controllers;

import com.example.demo.entity.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/clothes")
@RequiredArgsConstructor
public class ClothController {
    @GetMapping
    public List<Category> getCloth(){
        return Collections.EMPTY_LIST;
    }
}
