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
    private long id;

    @Column(name = "DURATION")
    private int duration;

   // @Enumerated(EnumType.STRING)
    @Column(name = "FILIERE")
    private Filiere filiere;

    @Column(name = "NIVEAU")
    private String niveau;
}
