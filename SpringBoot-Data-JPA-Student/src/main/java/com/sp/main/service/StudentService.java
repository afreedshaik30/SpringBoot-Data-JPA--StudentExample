package com.sp.main.service;

import java.util.List;

import com.sp.main.entity.Student;

public interface StudentService 
{
   //INSERT -- save	
   void addStudent(Student student);
   
   //SELECT by ID -- findById
   Student readStudentById(long id);
   
   //SELECT * -- findAll
   List<Student> readAllStudents();
   
   //UPDATE -- save 
   void updateStudent(long id, String name, int gpa);
   
   //DELETE -- deleteById
   void deleteStudent(long id);
}
