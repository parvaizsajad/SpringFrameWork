package com.spring.orm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	// inserting the data
@Transactional
	public int insert(Student student) {
		
		Integer save = (Integer) hibernateTemplate.save(student);
		
		return save;
	}
// getting one student at a time
public Student getStudent(int id) {
	Student student = hibernateTemplate.get(Student.class, id);
	return student;
}

// getting all students
public List<Student> getAllStudents(){
	List<Student> students = hibernateTemplate.loadAll(Student.class);
	return students;
}

 // deleting the student
@Transactional
public void deleteStudent(int id) {
	Student student = hibernateTemplate.get(Student.class,id);
	this.hibernateTemplate.delete(student);
}

// updating the student
@Transactional
public void updateStudent(Student student) {
	this.hibernateTemplate.update(student);
}

}
