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

import com.pm.test.dto.RolesDto;
import com.pm.test.service.RolesService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping("/roles")
public class RolesController {

	
	private final RolesService rolesService;
	
	@PostMapping
	public RolesDto save(@RequestBody RolesDto rolesDto) {
		return rolesService.save(rolesDto);
	}
	
	@PutMapping
	public RolesDto update(@RequestBody RolesDto rolesDto) {
		return rolesService.update(rolesDto);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		rolesService.delete(id);
	}
	
	@GetMapping("/{id}")
	public RolesDto findByid(@PathVariable Long id) {
		return rolesService.findByid(id);
	}
	
	@GetMapping
	public List<RolesDto> findAll(){
		return rolesService.findAll();
	}
	
}

