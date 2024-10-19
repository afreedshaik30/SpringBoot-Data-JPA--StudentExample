package com.sp.main;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sp.main.entity.Student;
import com.sp.main.service.StudentService;
import com.sp.main.service.StudentServiceImpl;

@SpringBootApplication
public class SpringBootDataJpaStudentApplication 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpaStudentApplication.class, args);
	    StudentService service = context.getBean(StudentServiceImpl.class);
	    
//   1.INSERT	    
	    Student s1 = new Student();
	    s1.setName("Devera");
	    s1.setGpa(7);
//	    service.addStudent(s1);

//   2.SELECT by ID	    
//	    Student s2 = service.readStudentById(2L);
//	    if (s2 != null) 
//	    {
//			System.out.println(s2);
//		}
   
//   3.SELECT *
//	    List<Student> allStudents = service.readAllStudents();
//	    for(Student stu : allStudents)
//	    {
//		  System.out.println(stu);
//	    }
	    
//   4.UPDATE 
//	    Student s4 = new Student();
//	    service.updateStudent(1L, "SHAIK AFREED" , 10);
	    
//   5.DELETE
//	    service.deleteStudent(3L);
	}
}
