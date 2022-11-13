package com.cst.map.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cst.map.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
