package com.pm.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pm.test.model.TaskEntity;


@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {

}
