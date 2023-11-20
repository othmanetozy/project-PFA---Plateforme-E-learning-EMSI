package com.Elearning.jparepos;

import com.Elearning.dto.CoursesDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IElearningRepo extends JpaRepository<CoursesDto, Double> {
    //List<CoursesDto> findByType(@Param("t")Categories type);

}
