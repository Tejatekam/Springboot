package com.ait.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.binding.Student;
import com.ait.entity.StudentEntity;
import com.ait.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public boolean saveStudent(Student student) {
		
		System.out.println(student);
		StudentEntity entity = new StudentEntity();
		BeanUtils.copyProperties(student,entity);
		entity.setTimings(Arrays.toString(student.getTimings()));
		System.out.println(entity);
		repo.save(entity);
		return true;
		
	}
	
	public List<String>  getCourse(){
		return Arrays.asList("Java","Python","AWS","Devops");
	}
	
	public List<String> getTimings(){
	    return 	Arrays.asList("Morning","Afternoon","Evening");
	}

}
