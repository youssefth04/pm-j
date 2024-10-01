package com.pm.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pm.test.model.RolesEntity;

@Repository
public interface RolesRepository extends JpaRepository<RolesEntity, Long> {

}
