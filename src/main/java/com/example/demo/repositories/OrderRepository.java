package com.example.demo.repositories;

import com.example.demo.entity.Cloth;
import com.example.demo.entity.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface OrderRepository extends CrudRepository<Order,Long> {
    @Override
    Optional<Order> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<Order> findAll();

    @Override
    Iterable<Order> findAllById(Iterable<Long> longs);

    List<Order> findAllByClothOrderByCloth(Cloth cloth);

    List<Order> findAllByUser(com.example.demo.entity.User user);

    @Query("select o from Order o where o.qty = :qty and o.actionDate < :dateTime")
    List<Order> selectByQtyAndBefore(Long qty, LocalDateTime actionDate);


}
