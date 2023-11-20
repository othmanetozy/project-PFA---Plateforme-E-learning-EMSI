package com.Elearning.services;

import com.Elearning.dto.CoursesDto;
import com.Elearning.repo.IElearningRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesServicesImplementation implements ICoursesServices {
    @Autowired
    public final IElearningRepo iElearningRepo;
    public CoursesServicesImplementation(IElearningRepo iElearningRepo) {
        this.iElearningRepo = iElearningRepo;
    }
}