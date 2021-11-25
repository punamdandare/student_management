package com.student.management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.management.entity.AddressEntity;
import com.student.management.entity.ExaminationEntity;
import com.student.management.entity.StudentEntity;
import com.student.management.repository.StudentRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		StudentEntity student = new StudentEntity();
//		student.setStudEmail("email@email.com");
//		student.setStudMobile("123456789");
//		student.setStudName("test-1");
//		student.setStudPass("password");
//		
//		AddressEntity addressEntity = new AddressEntity();
//		addressEntity.setId(5L);
//
//		student.setAddress(addressEntity);
//		
//		studentRepository.save(student);
		
		StudentEntity student = new StudentEntity();
		student.setStudEmail("email@email.com");
		student.setStudMobile("123456789");
		student.setStudName("test-1");
		student.setStudPass("password");
		
//        student.setAddress(address);
        
		AddressEntity address = new AddressEntity();
		address.setCity("Nagpur");
		address.setPincode("4411220");
		address.setState("MH");
		address.setStreet("Nandanvan");
		
		
		List<ExaminationEntity> examinations = new ArrayList<>();
		
		ExaminationEntity exam1 = new ExaminationEntity();
		exam1.setExamDate(LocalDate.now().toString());
		exam1.setExamRollNo("123");
		exam1.setExamType("Unit Test");
		
		ExaminationEntity exam2 = new ExaminationEntity();
		exam2.setExamDate(LocalDate.now().toString());
		exam2.setExamRollNo("568");
		exam2.setExamType("Mid Term");
		
		ExaminationEntity exam3 = new ExaminationEntity();
		exam3.setExamDate(LocalDate.now().toString());
		exam3.setExamRollNo("5874");
		exam3.setExamType("End Term");
		
		examinations.add(exam1);
		examinations.add(exam2);
		examinations.add(exam3);
		
		student.setAddress(address);
		student.setExams(examinations);
		
		studentRepository.save(student);
		System.out.println("Student Save succeessfully");
		
		
		
	}

}
