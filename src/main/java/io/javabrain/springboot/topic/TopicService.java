package io.javabrain.springboot.topic;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

//	private List<Topic> topics = new ArrayList<Topic> (Arrays.asList(
//			new Topic("spring", "Frozen", "movie about ice queen"),
//			new Topic("java", "Wall Street", "greed is good"),
//			new Topic("javascript", "Artist", "silent movie about fading movie star")
//		  ));
	
	public List<Topic> getAllTopics() {
//		return topics;
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}
	
	public void addTopic(Topic topic) {
//		topics.add(topic);
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
//		for(int i=0; i<topics.size(); i++) {
//			if (topics.get(i).getId().equals(id)) {
//				topics.set(i, topic);
//			}
//		}
	}
	
	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}
