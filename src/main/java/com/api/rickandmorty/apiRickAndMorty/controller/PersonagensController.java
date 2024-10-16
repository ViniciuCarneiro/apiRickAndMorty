package com.api.rickandmorty.apiRickAndMorty.controller;

import com.api.rickandmorty.apiRickAndMorty.model.dto.PersonagemDto;
import com.api.rickandmorty.apiRickAndMorty.model.dto.ResponseDto;
import com.api.rickandmorty.apiRickAndMorty.service.PersonagensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api")
public class PersonagensController {

    @Autowired
    private PersonagensService personagensService;

    @GetMapping(value = "/personagem")
    public ResponseEntity buscarTodosPersonagens(@RequestParam int page) {
        PersonagemDto personagemDto = personagensService.getAll(page);

        ResponseDto response = ResponseDto.builder()
                .results(personagemDto.getResults())
                .build();
        return ResponseEntity.ok().body(response);
    }
}
