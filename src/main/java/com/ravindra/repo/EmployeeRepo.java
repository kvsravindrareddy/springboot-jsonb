package com.ravindra.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ravindra.entity.EmployeeEntity;

@Repository
public interface EmployeeRepo extends CrudRepository<EmployeeEntity, Long>{
	Optional<EmployeeEntity> findByEmpId(String empId);
}
