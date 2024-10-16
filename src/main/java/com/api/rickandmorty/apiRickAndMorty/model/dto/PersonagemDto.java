package com.api.rickandmorty.apiRickAndMorty.model.dto;

import com.api.rickandmorty.apiRickAndMorty.model.entities.Personagem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Builder
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PersonagemDto implements Serializable {
    @JsonProperty("results")
    private List<Personagem> results;
}

