package com.pm.test.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pm.test.dto.TaskDto;
import com.pm.test.service.TaskService;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
@RequestMapping("/tasks")

public class TaskController {

	private final TaskService taskService;
	
	@PostMapping
	public TaskDto save(@RequestBody TaskDto taskDto) {
		
		return taskService.save(taskDto);
		
	}
	
	@PutMapping
	public TaskDto update(@RequestBody TaskDto taskDto) {
		return taskService.update(taskDto);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		taskService.delete(id);
	}
	@GetMapping("/{id}")
	public TaskDto findByid(@PathVariable Long id) {
		return taskService.findByid(id);
	}
	
	@GetMapping()
	public List<TaskDto> findAll(){
		return taskService.findAll();
	}
	

	}

