package com.student.management.repository;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;

import com.student.management.entity.StudentEntity;


public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
	
	

}
