package com.yaazhtech.online.learning.management.repository;

import com.yaazhtech.online.learning.management.data.CourseData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseData,Long> {

}