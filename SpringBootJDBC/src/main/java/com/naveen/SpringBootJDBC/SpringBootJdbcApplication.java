package com.naveen.SpringBootJDBC;

import com.naveen.SpringBootJDBC.model.Student;
import com.naveen.SpringBootJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
//		Student s = context.getBean(Student.class);
//		s.setRollNo(104);
//		s.setName("Naveen");
//		s.setMarks(68);
//
		StudentService service = context.getBean(StudentService.class);
//
//		service.addStudent(s);

		List<Student> data  = service.getAllStudents();
		for(int i=0;i<data.size();i++) {
			System.out.print(i + 1 + " | " + data.get(i).getRollNo() + " | " + data.get(i).getName() );
			System.out.println( " | " + data.get(i).getMarks());
		}
	}

}
