package com.student.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.entity.StudentEntity;
import com.student.management.repository.StudentRepository;
import com.student.management.service.StudentService;

import lombok.experimental.Delegate;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentservice;
	@Autowired
	private StudentRepository studentrepo;

	@PostMapping("/")
	public StudentEntity stdsave(@RequestBody StudentEntity stsave) {
		StudentEntity saveStd = studentservice.saveStd(stsave);
		return saveStd;
	}

	@PutMapping("/")
	public StudentEntity stdupdate(@RequestBody StudentEntity stupdate) {
		StudentEntity updatestd = studentservice.updatestd(stupdate);
		return updatestd;
	}

	@GetMapping("/")
	public List<StudentEntity> findAllStd() {
		List<StudentEntity> findAllstd = studentservice.findAllstd();
		return findAllstd;
	}

	@GetMapping("/{ID}")
	public StudentEntity findbyIdstd(@PathVariable(value = "ID") Long id) {
		StudentEntity findbyIdstd = studentservice.findbyIdstd(id);
		return findbyIdstd;
	}
	
	@DeleteMapping("/{ID}")
	public String deletestd(@PathVariable (value = "ID")Long id) {
		String deletStudent = studentservice.deletStudent(id);
		return deletStudent;
	}

	@GetMapping("/city/{CITY}")
	public List<StudentEntity> findStudentsByCity(@PathVariable (value = "CITY")String cit)
	{
		
		return studentservice.getStudentByCity(cit);
	}
	
//	@Autowired private StudentRepository studentRepository;
	@GetMapping("/street/{Street}")
	public List<StudentEntity> getStudentByStreet(@PathVariable(value = "Street") String str){
		return studentrepo.findStudentByStreet(str);
	}
}
