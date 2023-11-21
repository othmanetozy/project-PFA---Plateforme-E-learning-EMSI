package com.Elearning.jparepos;

import com.Elearning.dto.CoursesDto;
import com.Elearning.entities.Courses;
import com.Elearning.enums.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICoursesRepository extends JpaRepository<CoursesDto, Double> {
    List<CoursesDto> findByType(@Param("t") Categories type);

    void deleteById(Double id);
}
