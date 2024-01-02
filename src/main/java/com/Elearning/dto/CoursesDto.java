package com.Elearning.dto;

import com.Elearning.enums.Filiere;
import com.Elearning.enums.Niveau;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class CoursesDto {

     private long id;

    private int duration;

    @Enumerated(EnumType.STRING)
    private Filiere category;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;
}
