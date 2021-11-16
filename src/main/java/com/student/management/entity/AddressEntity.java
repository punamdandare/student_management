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
public class AddressEntity {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String city;
	private String pincode;
	private String street;
	private String state;
	
}
