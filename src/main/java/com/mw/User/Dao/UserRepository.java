package com.mw.User.Dao;

import com.mw.User.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
public interface UserRepository extends JpaRepository<User, Long> {
//    @Override
//    Optional<User> findById(Long aLong);
//
//    @Override
//    List<User> findAll();

//    @Override
//    void deleteById(Long aLong);
}
