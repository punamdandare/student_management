package com.student.management.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StudentEntity {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studId;
	private String studName;
	private String studMobile;
	private String studEmail;
	private  String studPass;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private AddressEntity address;
	
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
	
	
}
