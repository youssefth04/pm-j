package com.pm.test.model;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TaskEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="TASK_NAME")
	private String taskName;
	
	@Column(name="DESCRIPTION")
	private String description ;
	
	@CreatedDate
	@Column(name="CREATION_DATE")
	private Instant creationDate;
	
	@LastModifiedDate
	@Column(name="LAST_UPDATE")
	private Instant lastUpdate;
	
	

}
