package com.pm.test.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.pm.test.dto.TaskDto;
import com.pm.test.model.TaskEntity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class TaskMapper {
	
	private final ModelMapper modelMapper;
	
	public TaskEntity toEntity(TaskDto taskDto) {
		
		return modelMapper.map(taskDto, TaskEntity.class);
	}
	
	public TaskDto toDto(TaskEntity taskEntity) {
		
		return modelMapper.map(taskEntity, TaskDto.class);
	}
	

}
