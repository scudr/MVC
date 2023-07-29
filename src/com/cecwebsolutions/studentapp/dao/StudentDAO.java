package com.cecwebsolutions.studentapp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cecwebsolutions.studentapp.model.Student;

public class StudentDAO {

	private Connection connection;

	public StudentDAO(Connection connection) {
		this.connection = connection;
	}

	public List<Student> getStudents() throws SQLException {
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM Students");
		List<Student> students = new ArrayList<Student>();

		while (rs.next()) {
			Student student = new Student();
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name"));
			student.setAge(rs.getInt("age"));
			student.setEmail(rs.getString("email"));
			students.add(student);

		}
		return students;

	}

}
