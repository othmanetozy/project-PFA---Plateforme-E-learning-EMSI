package com.Elearning.services;

import com.Elearning.dto.CoursesDto;
import com.Elearning.entities.Courses;
import com.Elearning.jparepos.ICoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursesServices {
    private final ICoursesRepository courseRepository;

    @Autowired
    public CoursesServices(ICoursesRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<CoursesDto> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<CoursesDto> getCourseById(double courseId) {
        return courseRepository.findById(courseId);
    }

    public void createCourse(Courses course) {
        courseRepository.save(course);
    }

    public void updateCourse(Long courseId, Courses updatedCourse) {
        courseRepository.findById(Double.valueOf(courseId)).ifPresent(course -> {

            course.setTitle(updatedCourse.getTitle());

            courseRepository.save(course);
        });
    }

    public void deleteCourse(double courseId) {
        courseRepository.deleteById(courseId);
    }
}
