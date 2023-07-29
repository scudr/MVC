package com.cecwebsolutions.studentapp.service;

import java.sql.SQLException;
import java.util.List;

import com.cecwebsolutions.studentapp.dao.StudentDAO;
import com.cecwebsolutions.studentapp.model.Student;

public class StudentService {
	
	private StudentDAO studentDAO;
	
	
	public StudentService(StudentDAO studentDAO) {
		// TODO Auto-generated constructor stub
		this.studentDAO = studentDAO;
	}
	
	public List<Student> getStudents() throws SQLException{
		return studentDAO.getStudents();
	}

}
