package com.yaazhtech.online.learning.management.data;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class CourseData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable=false)
    private Long id;
    private String courseId;
    private String courseName;
    private String courseEnrollment;
    private String courseLevel;
    private String fees;
    private String duration;
    private String finalAssessment;
    private String certificate;
    private String language;
    private String videoCount;
    private String userName;
    private String mailId;
    private String mobile;
    private String courseTakenBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseEnrollment() {
        return courseEnrollment;
    }

    public void setCourseEnrollment(String courseEnrollment) {
        this.courseEnrollment = courseEnrollment;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFinalAssessment() {
        return finalAssessment;
    }

    public void setFinalAssessment(String finalAssessment) {
        this.finalAssessment = finalAssessment;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(String videoCount) {
        this.videoCount = videoCount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCourseTakenBy() {
        return courseTakenBy;
    }

    public void setCourseTakenBy(String courseTakenBy) {
        this.courseTakenBy = courseTakenBy;
    }
}
