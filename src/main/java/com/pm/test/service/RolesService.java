package com.pm.test.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pm.test.dto.RolesDto;
import com.pm.test.mapper.RolesMapper;
import com.pm.test.repository.RolesRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RolesService {
	
	private final RolesRepository rolesRepository;
	
	private final RolesMapper rolesMapper;
	
	public RolesDto save(RolesDto rolesDto) {
		
		return rolesMapper.toDto(rolesRepository.save(rolesMapper.toEntity(rolesDto)));
		
	}
	
	public RolesDto update(RolesDto rolesDto ) {
		return rolesMapper.toDto(rolesRepository.save(rolesMapper.toEntity(rolesDto)));
	}
	
	public void delete(Long id) {
		rolesRepository.deleteById(id);
		
	}
	public RolesDto findByid(Long id) {
		return rolesRepository.findById(id).map(rolesMapper::toDto).orElse(null);
	}
	
	public List<RolesDto> findAll(){
		
		return rolesRepository.findAll().stream().map(rolesMapper::toDto).collect(Collectors.toList());
	}


}


