package com.example.demo.repositories;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findAllByNameAndLastName(String name,String lastName);

    List<User> findAllByPhoneContaining(String phone);

    List<User> findAllByAddressEquals(String address);

    @Override
    Optional<User> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<User> findAll();

    @Override
    Iterable<User> findAllById(Iterable<Long> longs);

    @Query("select u from User u where u.born < :date and u.address like '%:address%'")
    List<User> selectAllBornBeforeAndAddress(LocalDate date, String address);
}
