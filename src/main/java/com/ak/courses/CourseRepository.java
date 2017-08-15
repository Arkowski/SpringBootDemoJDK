package com.ak.courses;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository <Course, String>{

    // CrudRepo contains all standard methods
    // Methods:
    // getAllTopics
    // getTopics(String id)
    // updateTopics(Course t)
    // deleteCourse(String id)

    // you can declare your own declaration and methods,
    // Crud lets you do this:
//    public List<Course> findByName(String name);
//    public List<Course> findByDescription(String foo);

    public List<Course> findByTopicId (String topicId);





}
