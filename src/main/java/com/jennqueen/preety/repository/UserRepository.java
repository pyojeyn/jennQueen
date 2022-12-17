package com.jennqueen.preety.repository;

import com.jennqueen.preety.entity.User;

import java.math.BigInteger;
import java.util.Optional;

public interface UserRepository extends JaneRepository<User, BigInteger>{
    Optional<User> findByEmail(String email);
}
