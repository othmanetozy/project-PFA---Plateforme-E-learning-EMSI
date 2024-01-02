package com.Elearning.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class CoursesDto {

    private long id;
    private int duration;
    private String category;
    private String niveau;
}
