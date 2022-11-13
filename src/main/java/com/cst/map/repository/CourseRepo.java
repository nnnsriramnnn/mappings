package com.cst.map.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cst.map.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long>{

}
