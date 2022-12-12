package com.jennqueen.preety.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface JaneRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {
}
