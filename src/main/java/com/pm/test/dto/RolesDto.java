package com.pm.test.dto;

import com.pm.test.model.UserEntity;

import lombok.Data;


@Data
public class RolesDto {
	
	
	private Long id;
	
	private String roleName;


	private UserEntity user;

}
