package com.annydeveloper.springRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.annydeveloper.springRest.entities.Courses;

public interface CourseDao extends JpaRepository<Courses, Long>{

}
