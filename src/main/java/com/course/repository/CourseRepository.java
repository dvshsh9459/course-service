package com.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.repository.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
 public  Course findCourseByCourseName(String courseName);
}
