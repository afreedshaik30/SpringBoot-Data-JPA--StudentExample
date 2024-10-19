package com.sp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.main.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> 
{

}
