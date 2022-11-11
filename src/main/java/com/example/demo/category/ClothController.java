package com.example.demo.category;

import com.example.demo.category.entity.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/shoes")
@RequiredArgsConstructor
public class ClothController {
    @GetMapping
    public List<Category> getShoes(){
        return Collections.EMPTY_LIST;
    }
}
