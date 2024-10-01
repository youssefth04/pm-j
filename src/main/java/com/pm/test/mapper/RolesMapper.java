package com.pm.test.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.pm.test.dto.RolesDto;
import com.pm.test.model.RolesEntity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class RolesMapper {

	
	private final ModelMapper modelMapper;

	public RolesDto toDto(RolesEntity rolesEntity) {
		return modelMapper.map(rolesEntity, RolesDto.class);
	}
	
	public RolesEntity toEntity(RolesDto rolesDto) {
		return modelMapper.map(rolesDto, RolesEntity.class);
	}
}
