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
public class RolesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="ROLE_NAME")
	private String roleName;
	
	@CreatedDate
	@Column(name="CREATION_DATE")
	private Instant creationDate;
	
	@LastModifiedDate
	@Column(name="LAST_UPDATE")
	private Instant lastModifiedDate;
	
	
	

}
