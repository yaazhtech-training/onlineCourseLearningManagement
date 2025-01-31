package com.yaazhtech.online.learning.management.controller;

import com.yaazhtech.online.learning.management.data.CourseData;
import com.yaazhtech.online.learning.management.model.CourseInput;
import com.yaazhtech.online.learning.management.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course/courseCreation")
public class CourseController {
    @Autowired//to inject other packages from different packages
    private CourseRepository courseRepo;//object reference
    @PostMapping("/saveCourse")
    public String newCourse(@RequestBody CourseInput courseObject) {//@Requestbody-to pass whole class as a input
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
        return "course enrolled successfully";//terminal response message
    }
    @GetMapping("/readCourse")//to read the data in our database
    public List<CourseData> getAllCourse() {//table data as output
        return courseRepo.findAll();//

    }
    @GetMapping("/readCourse/{id}")
    public CourseData getOneCourse(@PathVariable Long id) { //@pathvariable-to pass single variable as a input
        return courseRepo.findById(id).orElse(null);//to handle negatyive scenerios//your id may or may not be present so we need to check else case aslo

    }
    @DeleteMapping("/deleteCourse/{id}")
    public String deleteCourse(@PathVariable Long id) {
        courseRepo.deleteById(id);
return "Course deleted successfully";
    }

    @PutMapping("/modifyCourse/{id}")//to update already existing rec and save it again
    public CourseData updateCourse(@PathVariable Long id, @RequestBody CourseData updatedData) {

        CourseData existingData=courseRepo.findById(id).orElse(null);//table data

        if(existingData!=null){//not equal to null

            existingData.setFees(updatedData.getFees());

            existingData.setCourseLevel(updatedData.getCourseLevel());
        }
     //   assert existingData != null;
        return courseRepo.save(existingData);
    }

}

