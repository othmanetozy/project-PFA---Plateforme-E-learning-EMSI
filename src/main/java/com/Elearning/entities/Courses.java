package com.Elearning.entities;

import jakarta.persistence.*;
import lombok.*;
import com.Elearning.enums.Filiere;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Courses")
@Builder
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID")
    private double Id;

    @Column(name = "DURATION")
    private int Duration;


    @Enumerated(EnumType.STRING)
    @Column(name = "FILIERE")
    private String Category;

    @Column(name = "NIVEAU")
    private String Niveau;

    @Column(name = "FILIERE")
    @Enumerated(EnumType.STRING)
    private Filiere Filiere;
}