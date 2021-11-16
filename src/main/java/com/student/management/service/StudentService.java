package com.student.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.entity.StudentEntity;
import com.student.management.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired

	private StudentRepository studentrepo;

	public StudentEntity saveStd(StudentEntity std) {
		StudentEntity save = studentrepo.save(std);
		return save;
	}

	public StudentEntity updatestd(StudentEntity std) {
		StudentEntity save = studentrepo.save(std);
		return save;
	}

	public List<StudentEntity> findAllstd() {
		List<StudentEntity> findAll = studentrepo.findAll();
		return findAll;
	}

	public StudentEntity findbyIdstd(Long id) {
//		Optional<StudentEntity> findById = studentrepo.findById(id);
//		
//		if(findById.isPresent())
//		{
//			StudentEntity studentEntity = findById.get();
//			return studentEntity;
//		}else {
//			throw new RuntimeException("Student Not found...!");
//		}
		
		StudentEntity studentEntity = studentrepo.findById(id).orElseThrow(() -> new RuntimeException("Student Not found...!"));
		return studentEntity;
	}
	
	public String deletStudent(Long id)
	{
		StudentEntity studentEntity = studentrepo.findById(id).orElseThrow(() -> new RuntimeException("Student Not found...!"));
		studentrepo.delete(studentEntity);
		return "Student delete by id "+id;
	}
}
