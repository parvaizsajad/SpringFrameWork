package com.spring.jdbcDao;

import java.util.List;

import com.spring.jdbcEntities.Student;

public interface StudentDao {
public int insert(Student student);
public int update(Student student);
public int delete(int id);
public Student getStudent(int id);
public List<Student> getAllStudents();
}
