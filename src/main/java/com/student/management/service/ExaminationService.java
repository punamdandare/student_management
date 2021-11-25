package com.student.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.entity.ExaminationEntity;
import com.student.management.repository.ExaminationRepository;

@Service
public class ExaminationService {

	@Autowired
	private ExaminationRepository examinationRepository;
	
	public List<ExaminationEntity> saveexam(List<ExaminationEntity> save) {
		List<ExaminationEntity> entity = examinationRepository.saveAll(save);
		return entity;
	}
	
	public List<ExaminationEntity> findAllexam(){
		List<ExaminationEntity> all = examinationRepository.findAll();
		return all;
	}
	
	public ExaminationEntity findByIdexam(Long id) {
		ExaminationEntity orElseThrow = examinationRepository.findById(id).orElseThrow(() -> new RuntimeException("Exam Details Not Found....!!"));
		return orElseThrow;
	}
	
	
}
