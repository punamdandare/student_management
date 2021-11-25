package com.student.management.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Getter
@Setter
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studId;
	private String studName;
	private String studMobile;
	private String studEmail;
	private String studPass;
	
	@JoinColumn(columnDefinition = "address_id", referencedColumnName = "id")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private AddressEntity address;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<ExaminationEntity> exams;

	public Long getStudId() {
		return studId;
	}

	public void setStudId(Long studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudMobile() {
		return studMobile;
	}

	public void setStudMobile(String studMobile) {
		this.studMobile = studMobile;
	}

	public String getStudEmail() {
		return studEmail;
	}

	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}

	public String getStudPass() {
		return studPass;
	}

	public void setStudPass(String studPass) {
		this.studPass = studPass;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public List<ExaminationEntity> getExams() {
		return exams;
	}

	public void setExams(List<ExaminationEntity> exams) {
		this.exams = exams;
	}
	

}
