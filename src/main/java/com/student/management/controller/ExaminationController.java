package com.student.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.entity.ExaminationEntity;
import com.student.management.repository.ExaminationRepository;
import com.student.management.service.ExaminationService;

@RestController
@RequestMapping("/exam")
public class ExaminationController {

	@Autowired
	private ExaminationService examinationService;
	
	@Autowired
	private ExaminationRepository examrepo;
	
	@PostMapping("/")
	public ExaminationEntity saveexam(@RequestBody ExaminationEntity save) {
		ExaminationEntity saveexam = examinationService.saveexam(save);
		return saveexam;
	}
	
	@GetMapping("/")
	public List<ExaminationEntity> findexamn(){
		List<ExaminationEntity> allexam = examinationService.findAllexam();
		return allexam;
	}
	
	@GetMapping("/{ID}")
	public ExaminationEntity findbyID(@PathVariable(value = "ID") Long id) {
		ExaminationEntity findByIdexam = examinationService.findByIdexam(id);
		return findByIdexam;
	}
	
	@PutMapping("/")
	public ExaminationEntity updateexam(@RequestBody ExaminationEntity update) {
		ExaminationEntity save = examrepo.save(update);
		return save;
	}
}
