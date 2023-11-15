package com.Elearning.services;

import com.Elearning.dto.CoursesDto;
import com.Elearning.repo.IElearningRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

@Service
public class CoursesServicesImplementation implements ICoursesServices {
    @Autowired
    public IElearningRepo iElearningRepo;
    public CoursesDto AddCourse(CoursesDto coursesDto) {
    return
    }

}