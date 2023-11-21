package com.Elearning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Entity @Builder
public class Courses {
    @Id
    private double Id;
    private int Duration;
    @Enumerated(EnumType.STRING)
    private String Category;
    private String Niveau;
}