package com.sp.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.main.entity.Student;
import com.sp.main.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
    private StudentRepository studentRepo; 
	
	@Override
	public void addStudent(Student student) 
	{
	   studentRepo.save(student);
	}

	@Override
	public Student readStudentById(long id) 
	{
		Optional<Student> optional = studentRepo.findById(id); // returns Optional<Student>
		return optional.orElse(null);
	}

	@Override
	public List<Student> readAllStudents() 
	{
		return studentRepo.findAll();
	}

	@Override
	public void updateStudent(long id, String name, int gpa) 
	{
		//fetch student by id into a Student object
	    Student stu = readStudentById(id);
	    if(stu != null) //if stu is exist on that id then 
	    {
	    	stu.setName(name);
	    	stu.setGpa(gpa);
	    	studentRepo.save(stu); //update student
	    }
	}

	@Override
	public void deleteStudent(long id) 
	{
		studentRepo.deleteById(id);
	}
}
