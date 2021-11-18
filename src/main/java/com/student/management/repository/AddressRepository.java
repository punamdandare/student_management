package com.student.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.management.entity.AddressEntity;
@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long>{

}
