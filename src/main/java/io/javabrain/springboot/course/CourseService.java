package io.javabrain.springboot.course;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

//	private List<Topic> topics = new ArrayList<Topic> (Arrays.asList(
//			new Topic("spring", "Frozen", "movie about ice queen"),
//			new Topic("java", "Wall Street", "greed is good"),
//			new Topic("javascript", "Artist", "silent movie about fading movie star")
//		  ));
	
	public List<Course> getAllCourses(String topicId) {
//		return Courses;
		List<Course> courses = new ArrayList<Course>();

//		courseRepository.findAll().forEach(courses::add);
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}
	
	public void addCourse(Course course) {
//		topics.add(topic);
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course) {
		courseRepository.save(course);
//		for(int i=0; i<topics.size(); i++) {
//			if (topics.get(i).getId().equals(id)) {
//				topics.set(i, topic);
//			}
//		}
	}
	
	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}
