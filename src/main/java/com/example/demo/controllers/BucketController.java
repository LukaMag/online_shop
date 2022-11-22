package com.example.demo.controllers;

import com.example.demo.entity.Bucket;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/bucket")
@RequiredArgsConstructor
public class BucketController {
    @GetMapping
    public List<Bucket> getCloth(){
        return Collections.EMPTY_LIST;
    }
}
