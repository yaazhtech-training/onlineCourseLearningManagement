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
}
