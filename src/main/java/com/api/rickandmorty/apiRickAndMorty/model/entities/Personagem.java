package com.api.rickandmorty.apiRickAndMorty.model.entities;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Personagem implements Serializable {
    private Long id;
    private String name;
    private String status;
    private String species;
    private String gender;
    private String image;
}
