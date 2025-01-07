package com.yaazhtech.online.learning.management.controller;

import com.yaazhtech.online.learning.management.data.CourseData;
import com.yaazhtech.online.learning.management.model.CourseInput;
import com.yaazhtech.online.learning.management.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course/courseCreation")
public class CourseController {
    @Autowired
    private CourseRepository courseRepo;
    @PostMapping
    public String newCourse(@RequestBody CourseInput courseObject) {
        //construct new object to our entity class(CourseData)
        CourseData courseData=new CourseData();
        courseData.setCourseId(courseObject.getCourseId());
        courseData.setCourseName(courseObject.getCourseName());
        courseData.setCourseEnrollment(courseObject.getCourseEnrollment());
        courseData.setCourseLevel(courseObject.getCourseLevel());
        courseData.setFees(courseObject.getFees());
        courseData.setDuration(courseObject.getDuration());
        courseData.setFinalAssessment(courseObject.getFinalAssessment());
        courseData.setLanguage(courseObject.getLanguage());
        courseData.setVideoCount(courseObject.getVideoCount());
        courseData.setUserName(courseObject.getUserName());
        courseData.setMailId(courseObject.getMailId());
        courseData.setMobile(courseObject.getMobile());
        courseData.setCourseTakenBy(courseObject.getCourseTakenBy());
         //save it in repository
        courseRepo.save(courseData);
        return "course enrolled successfully";
    }
}

