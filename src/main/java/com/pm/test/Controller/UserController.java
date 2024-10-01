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

import com.pm.test.dto.UserDto;
import com.pm.test.service.UserService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

	
	private final  UserService userService;
	
	@PostMapping
	public UserDto save(@RequestBody UserDto userDto) {
		
		return userService.save(userDto);
	}
	
	@PutMapping("/up")
	public UserDto update (@RequestBody UserDto userDto) {
		
		return userService.update(userDto);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		userService.delete(id);
	}
	
	@GetMapping("/{id}")
	public UserDto findByid(@PathVariable Long id) {
		return userService.findByid(id);
		
	}
	
	@GetMapping()
	public List<UserDto> findAll(){
		return userService.findAll();
	}
	
}
