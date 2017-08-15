package com.ak.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

//    private List<Course> courses = new ArrayList<>(Arrays.asList(
//            new Course("spring1", "Spring Framework1", "Spring Framework description1"),
//            new Course("spring2", "Spring Framework2", "Spring Framework description2"),
//            new Course("spring3", "Spring Framework3", "Spring Framework description3")
//    ));

    public List<Course> getAllCourses(String topicId) {
        /// return courses;
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).
                forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
        return courseRepository.findOne(id); //  with Crud
//        return courses.stream().filter(t -> t.getId().equals(id)).findFirst().get();    <with Lambda
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        // Crud:
        courseRepository.save(course);
        }

//        for (int i = 0; i < courses.size(); ++i) {
//            Course t = courses.get(i);
//            if (t.getId().equals(id)) {
//                courses.set(i, course);
//                return;
//          }

    public void deleteTopic(String id) {
        // Lambda:
//        courses.removeIf(t -> t.getId().equals(id));
        // Crud:
        courseRepository.delete(id);
    }
}
