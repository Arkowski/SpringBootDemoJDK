package com.ak.topics;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository <Topic, String>{



    // CrudRepo contains all standard methods
    // Methods:
    // getAllTopics
    // getTopics(Stringg id)
    // updateTopics(Course t)
    // deleteCourse(String id)

}
