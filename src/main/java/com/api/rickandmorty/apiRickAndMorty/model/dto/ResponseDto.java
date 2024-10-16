package com.api.rickandmorty.apiRickAndMorty.model.dto;

import com.api.rickandmorty.apiRickAndMorty.model.entities.Personagem;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Data
@Getter
@Setter
public class ResponseDto {
    private List<Personagem> results;
}
