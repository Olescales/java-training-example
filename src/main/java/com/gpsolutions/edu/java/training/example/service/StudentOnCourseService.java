package com.gpsolutions.edu.java.training.example.service;

import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

/**
 * @author Wladimir Litvinov
 */
@Log
@Service
public class StudentOnCourseService {
    public void registerOnCourse(final Long studentId, final Long courseId) {
        log.info(String.format("Registration of student (%d) on course (%d)", studentId, courseId));
    }
}