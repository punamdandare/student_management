package com.student.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.management.entity.AddressEntity;
import com.student.management.repository.AddressRepository;
@Service
public class AddressService {
@Autowired
	public AddressRepository addressrepo;

public AddressEntity saveadd(AddressEntity add) {
	
	AddressEntity save = addressrepo.save(add);
	return save;
}

public AddressEntity updateadd(AddressEntity update) {
	AddressEntity save = addressrepo.save(update);
	return save;
}

public List<AddressEntity> findbyAll() {
	List<AddressEntity> all = addressrepo.findAll();
	return all;
	
}

public AddressEntity findbyId(Long id) {
	AddressEntity orElseThrow = addressrepo.findById(id).orElseThrow(() -> new RuntimeException("Address not Found...!1"));
return orElseThrow;
}


}

