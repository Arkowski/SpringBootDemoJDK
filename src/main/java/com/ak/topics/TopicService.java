package com.ak.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("spring1", "Spring Framework1", "Spring Framework description1"),
//            new Topic("spring2", "Spring Framework2", "Spring Framework description2"),
//            new Topic("spring3", "Spring Framework3", "Spring Framework description3")
//    ));

    public List<Topic> getAllTopics() {
        /// return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().
                forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findOne(id); //  with Crud
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();    <with Lambda
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        //old school :
//        for (int i = 0; i < topics.size(); ++i) {
//            Course t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//          }
        // Crud:
        topicRepository.save(topic);
        }


    public void deleteTopic(String id) {
        // Lambda:
//        topics.removeIf(t -> t.getId().equals(id));
        //Crud:
        topicRepository.delete(id);
    }
}
