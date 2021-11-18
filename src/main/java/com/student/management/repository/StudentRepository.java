package com.student.management.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.student.management.entity.StudentEntity;


public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
		
	List<StudentEntity> findAllByAddressCity(String city);
	
	List<StudentEntity> findAllByAddressState(String stat);
	
	StudentEntity findAllByStudMobile(String mobile);
	
	@Query(nativeQuery = true, value = "SELECT * FROM `student_entity` s inner join `address_entity` a on s.`address_id` = a.`id` WHERE a.street=:str")
	List<StudentEntity> findStudentByStreet(@Param("str") String street);
	

}
