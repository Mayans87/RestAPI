package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Courses;

public interface CourseService {
	public Courses getCourse(long courseId);

	public List<Courses> getCourses();
	public Courses addcourse(Courses course);
	public Courses updateCourse(Courses course);
	public void deleteCourse(long parseLong);

}
