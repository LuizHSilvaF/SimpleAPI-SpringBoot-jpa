package com.luiz.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.userdept.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
}
