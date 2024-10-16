package com.api.rickandmorty.apiRickAndMorty.integrations;

import com.api.rickandmorty.apiRickAndMorty.model.dto.PersonagemDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "rickAndMortyClient", url = "${rickandmorty.api.url}")
public interface ApiRickAndMortyIntegration {

    @GetMapping("/character")
    PersonagemDto getCharacters(
            @RequestParam(value = "page", required = false) Long page,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "status") String status
    );
}
