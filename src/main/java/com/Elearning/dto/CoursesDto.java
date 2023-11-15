package com.Elearning.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Entity
public class CoursesDto {
    @Id
    private Double id;
    private int Duration;
    private String Category;
    private String Niveau;
}