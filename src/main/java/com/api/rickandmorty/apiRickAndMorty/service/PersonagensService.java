package com.api.rickandmorty.apiRickAndMorty.service;

import com.api.rickandmorty.apiRickAndMorty.integrations.ApiRickAndMortyIntegration;
import com.api.rickandmorty.apiRickAndMorty.model.dto.PersonagemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class PersonagensService {

    @Autowired
    private ApiRickAndMortyIntegration integration;

    @Cacheable(value = "personagens", key = "#page")
    public PersonagemDto getAll(Long page, String name) {
        System.out.println("Dados recuperados da API externa");

        String status = "alive";

        PersonagemDto dto = integration.getCharacters(page, name,status);

        if (name == null) {
            for (int i = 0; i < dto.getResults().size(); i++) {
                dto.getResults().get(i).setSpecies(null);
            }
        }

        return dto;
    }
}
