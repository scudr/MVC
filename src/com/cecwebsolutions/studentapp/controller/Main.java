package com.cecwebsolutions.studentapp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.cecwebsolutions.studentapp.dao.StudentDAO;
import com.cecwebsolutions.studentapp.model.Student;
import com.cecwebsolutions.studentapp.service.StudentService;

public class Main {

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Students", "postgres", "2104");

		StudentDAO studentDAO = new StudentDAO(connection);
		StudentService studentService = new StudentService(studentDAO);
		List<Student> students = studentService.getStudents();
		
		for(Student student: students) {
			System.out.println(student.getName());
		}
		
	}

}
