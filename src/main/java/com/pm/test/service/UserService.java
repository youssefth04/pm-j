package com.pm.test.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pm.test.dto.UserDto;
import com.pm.test.mapper.UserMapper;
import com.pm.test.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserMapper userMapper;
	
	private final  UserRepository userRepository;

	public UserDto save(UserDto userDto) {
		
		return userMapper.toDto(userRepository.save(userMapper.toEntity(userDto)));
	}
	
	public UserDto update(UserDto userDto) {
		return userMapper.toDto(userRepository.save(userMapper.toEntity(userDto)));
		
	}
	
	public void  delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public UserDto findByid(Long id) {
		
		return userRepository.findById(id).map(userMapper::toDto).orElse(null);
	}
	
	public List<UserDto> findAll(){
		
		return userRepository.findAll().stream().map(userMapper::toDto).collect(Collectors.toList());
	}
}
