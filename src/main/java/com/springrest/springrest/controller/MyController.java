package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService obj; //obj to initialized all the constructors....
	@GetMapping("/home") 
	public String home() {                           //trial code...
		return "This is home page!";  }  
	
	//for courses:-
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		 
		return this.obj.getCourses();
		
	}
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.obj.getCourse(Long.parseLong(courseId));  //convert course_id string to long. 
	}
	@PostMapping("/courses")
	public Courses postCourse(@RequestBody Courses courses) {
		return this.obj.addcourse(courses);
		
	}
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses courses) {
		return this.obj.updateCourse(courses);
	}
	@DeleteMapping("/courses/{courseId}")
	public void deletecourse(@PathVariable String courseId) {
		try {
			this.obj.deleteCourse(Long.parseLong(courseId));
		}
		catch(Exception e) {
		 
		}
	}

}
