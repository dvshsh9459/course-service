package com.course.controller.request;

import java.util.List;

import com.course.repository.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddCourseRequest {
	private String courseName;
	private String duration;
	private String description;
	private double fee;
	private List<AddSubjectRequest> addSubjectToCourse;

}
