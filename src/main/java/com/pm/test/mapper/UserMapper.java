package com.pm.test.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.pm.test.dto.UserDto;
import com.pm.test.model.UserEntity;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserMapper {
	
	
	private final ModelMapper modelMapper ;
	
	public UserDto toDto(UserEntity user) {
		
		return modelMapper.map(user, UserDto.class);
	}
	
	public UserEntity toEntity(UserDto dto) {
		
		return modelMapper.map(dto, UserEntity.class);
	}

}
