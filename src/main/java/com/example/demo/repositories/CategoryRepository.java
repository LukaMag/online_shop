package com.example.demo.repositories;

import com.example.demo.entity.Category;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {

    @Override
    Optional<Category> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<Category> findAll();

    @Override
    Iterable<Category> findAllById(Iterable<Long> longs);

    Optional<Category> findDistinctByCategoryContains(String categoryName);

    @Query("select distinct c from Category as c where c.categoryDesc like '%:categoryDesc%'")
    List<Category> selectCategoriesByDescription(String categoryDesc);

    @Query("select c from Category c where c.category like ':category%'")
    List<Category> selectCategoriesStartsWith(String category, Sort sort);
}
