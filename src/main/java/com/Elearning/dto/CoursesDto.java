package com.Elearning.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Entity @Builder
public class CoursesDto {
    @Id
    private double Id;
    private int Duration;
    private String Category;
    private String Niveau;
}