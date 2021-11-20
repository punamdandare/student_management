package com.student.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.management.entity.ExaminationEntity;

public interface ExaminationRepository extends JpaRepository<ExaminationEntity, Long>{

}
