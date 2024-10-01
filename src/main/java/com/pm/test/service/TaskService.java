package com.pm.test.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pm.test.dto.TaskDto;
import com.pm.test.mapper.TaskMapper;
import com.pm.test.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TaskService {

	private final TaskMapper taskMapper;
	
	private final TaskRepository taskRepository;
	
	public TaskDto save(TaskDto taskDto) {
		return taskMapper.toDto(taskRepository.save(taskMapper.toEntity(taskDto)));
		
	}
	
	public TaskDto update(TaskDto taskDto) {
		
		return taskMapper.toDto(taskRepository.save(taskMapper.toEntity(taskDto)));
	}

	public void delete(Long id) {
		taskRepository.deleteById(id);
	}
	
	public TaskDto findByid(Long id) {
		return taskRepository.findById(id).map(taskMapper::toDto).orElse(null);
		
	}
	 public List<TaskDto> findAll(){
		 return taskRepository.findAll().stream().map(taskMapper::toDto).collect(Collectors.toList());
	 }
	 
}
