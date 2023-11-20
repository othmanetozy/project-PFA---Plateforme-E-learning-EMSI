package com.Elearning.services;

import com.Elearning.jparepos.IElearningRepo;
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