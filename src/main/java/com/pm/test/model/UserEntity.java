package com.pm.test.model;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class UserEntity {

	
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
	    @Column(name = "FIRST_NAME")
	    private String firstName;

	    @Column(name = "LAST_NAME")
	    private String lastName;

	    @Column(name = "EMAIL")
	    private String email;

	    @Column(name = "PASSWORD")
	    private String password;
	    
	    @CreatedDate
	    @Column(name="CREATION_DATE")
	    private Instant creationDate;
	    
	    @LastModifiedDate
	    @Column(name="LAST_UPDATE")
	    private Instant lastUpdate;
	    
	    
	    @ManyToOne
	    @JoinColumn(name="ROLE")
	    private RolesEntity role;
	    

}