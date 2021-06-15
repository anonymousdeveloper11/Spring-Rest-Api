package com.annydeveloper.springRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.annydeveloper.springRest.dao.CourseDao;
import com.annydeveloper.springRest.entities.Courses;
@Service
public class CourseSercviceImpl implements courseService{
	@Autowired
	private CourseDao courseDao;
	//List<Courses> list;

	public CourseSercviceImpl() {
//		list = new ArrayList<>();
//		list.add(new Courses(133,"Java Course","This course contain java core"));
//		list.add(new Courses(122, "Spring boot", "Spring Boot course"));
		
	}
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		
		return courseDao.findAll();
	}
	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Courses c = null;
//		for(Courses course:list) {
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}
	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
//		list.add(course);
		courseDao.save(course);
		return course;
	}
	@Override
	public Courses updateCourse(Courses course) {
		// TODO Auto-generated method stub
//		list.forEach(e ->{
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		
		return course;
	}
	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		//list = this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
	Courses entity =courseDao.getOne(courseId);
	courseDao.delete(entity);
	}

}
