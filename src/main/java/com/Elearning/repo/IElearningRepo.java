package com.Elearning.repo;

import com.Elearning.dto.CoursesDto;
import com.Elearning.enums.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IElearningRepo extends JpaRepository<CoursesDto, Double> {
    //List<CoursesDto> findByType(@Param("t")Categories type);

}
