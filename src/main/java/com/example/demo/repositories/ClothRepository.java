package com.example.demo.repositories;

import com.example.demo.entity.Cloth;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ClothRepository extends CrudRepository<Cloth,Long> {


    @Override
    Optional<Cloth> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<Cloth> findAll();

    @Override
    Iterable<Cloth> findAllById(Iterable<Long> longs);

    List<Cloth> findAllByReleaseIsBefore(LocalDate date);

    @Query("select c from Cloth c where c.price < :price")
    List<Cloth> findClothesCheaperThan(Double price);

    @Query("select c from Cloth c where c.size like :size and c.color like :color")
    List<Cloth> findClothesBySizeAndColor(String size,String color);
}
