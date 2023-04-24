package com.springrest.springrest.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;


@Service
public class CourseServiceImpl implements CourseService {
//	List<Courses>list;
	
	@Autowired
	private CourseDao courseDao;

	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Courses( 185 ,"Java Core","this is java core description"));
//		list.add(new Courses( 155 ,"Advanced Java","this is adv java description"));
	}

    public List<Courses> getCourses(){
		
		return courseDao.findAll();
	}
    

	
	@Override
	public Courses getCourse(long courseId) {
//		Courses c = null;
//		for (Courses courses : list) {
//			if(courses.getId()==courseId) {
//				c=courses;
//				break;
//			}}
			return courseDao.getReferenceById(courseId);
			
		
		
		
		
		
		
	}

	@Override
	public Courses addcourse(Courses course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	

	@Override
	public void deleteCourse(long parseLong) {
//			list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		courseDao.deleteById(parseLong);
		
		};
		
	}


