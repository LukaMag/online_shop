package com.example.demo.cloth;

import com.example.demo.cloth.entity.Cloth;
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
    public List<Cloth> getShoes(){
        return Collections.EMPTY_LIST;
    }
}
