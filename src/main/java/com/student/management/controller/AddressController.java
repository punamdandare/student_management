package com.student.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.entity.AddressEntity;
import com.student.management.entity.StudentEntity;
import com.student.management.repository.StudentRepository;
import com.student.management.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	public AddressService addressService; 


	@PostMapping("/")
	public AddressEntity saveaddress(@RequestBody StudentEntity student) {
	
		AddressEntity saveadd = addressService.saveadd(student.getAddress());
		
		return saveadd;
	}

	@PutMapping("/")
	public AddressEntity updateadd(@RequestBody AddressEntity uadd) {
		AddressEntity updateadd = addressService.updateadd(uadd);
		return updateadd;

	}

	@GetMapping("/")
	public List<AddressEntity> findByall() {
		List<AddressEntity> list = addressService.findbyAll();
		return list;
	}

	@GetMapping("/{ID}")
	public AddressEntity findByid(@PathVariable(value = "ID") Long id) {
		AddressEntity addressEntity = addressService.findbyId(id);
		return addressEntity;
	}

}
