package com.Elearning.dto;

import com.Elearning.enums.Niveau;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FichesDto {
    private long id;
    private String name;

    //@Enumerated(EnumType.STRING)
    private Niveau niveau;
}
