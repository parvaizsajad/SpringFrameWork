package com.spring.jdbcDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbcEntities.Student;
@Component("StudentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
  private JdbcTemplate jdbcTemplate;
	RowMapper<Student> rowMapper;

public int insert(Student student) {

	   // inser querry
    String qurrey="insert into student (id,name,city) values(?,?,?)";
    int result = this.jdbcTemplate.update(qurrey,student.getId(),student.getName(),student.getCity());
	return result;
}
public int update(Student student) {
	// upadte querry
	String qurrey="update student set name=?, city=? where id=?";
	int r = jdbcTemplate.update(qurrey,student.getName(),student.getCity(),student.getId());
	return r;
}


public int delete(int id) {
	Student student=new Student();
	String qurrey="delete from student where id=?";
	int r = jdbcTemplate.update(qurrey,id);
	return r;
}

public Student getStudent(int id) {
String qurrey="select * from student where id=?";
rowMapper= new rowMapperImpul();
Student student = jdbcTemplate.queryForObject(qurrey, rowMapper,id);
	return student;
}
public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}


//Note: query for object is used to retrive the single record from the database
// while as the querry is used to retrive the list of records from the database.
// Method to get all the students from the database
public List<Student> getAllStudents() {
	String querry="Select * from student";
	List<Student> ls = this.jdbcTemplate.query(querry, new rowMapperImpul());
	return ls;
}






}
