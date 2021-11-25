package com.student.management.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class ExaminationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long examId;
	private String examType;
	private String examRollNo;
	private String examDate;

}
