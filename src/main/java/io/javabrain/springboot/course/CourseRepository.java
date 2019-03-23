package io.javabrain.springboot.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{

	//Spring will check on the parameters in Course class,
	//and auto mapping attribute to findBy[attribute]
	//In this case, name/description are attribute of course class
	
	public List<Course> findByName(String name);
	public List<Course> findByDescription(String desc);
	
	public List<Course> findByTopicId(String topicId);
}
