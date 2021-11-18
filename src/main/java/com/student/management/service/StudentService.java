package com.student.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.entity.AddressEntity;
import com.student.management.entity.StudentEntity;
import com.student.management.repository.AddressRepository;
import com.student.management.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired

	private StudentRepository studentrepo;
	
	@Autowired
	private AddressRepository entity;

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
	
//	public List<StudentEntity> entity(List<AddressEntity> service){
//		List<AddressEntity> findAll = entity.findAll();
//		List<StudentEntity> findAll2 = studentrepo.findAll();
////		for(Object obj: findAll) {
////			obj.get
////		}
//		for(AddressEntity e:service) {
//			String city = e.getCity();
//		
//		if(city.contains("Nagpur")) {
//	
//			List<StudentEntity> studentEntity = (List<StudentEntity>) findAll2.get(0);
//		return studentEntity;
//		}}
//		
//		return null;
//		
//	}
	public List<StudentEntity> getStudentByCity(String city){
		List<StudentEntity> findAllByAddressCity = studentrepo.findAllByAddressCity(city);
		return findAllByAddressCity;
	}
	
	}
