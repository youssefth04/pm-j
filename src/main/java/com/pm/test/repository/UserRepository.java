package com.pm.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pm.test.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
