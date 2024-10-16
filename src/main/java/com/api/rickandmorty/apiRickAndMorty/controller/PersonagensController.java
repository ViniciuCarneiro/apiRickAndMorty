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

// base_url = localhost:8080
// base_url = 192.10.1.58:8080
// base_url = www.apifabricio.com.br

// path = /api

// resorce = /personagem

// base_url+path+resource
//localhost:8080/api/personagem/?page=1

@RestController
@RequestMapping(value = "api")
public class PersonagensController {

    @Autowired
    private PersonagensService personagensService;

    @GetMapping(value = "/personagem")
    public ResponseEntity buscarTodosPersonagens(@RequestParam Long page, @RequestParam(required = false) String name) {
        PersonagemDto personagemDto = personagensService.getAll(page, name);

        ResponseDto response = ResponseDto.builder()
                .results(personagemDto.getResults())
                .build();
        return ResponseEntity.ok().body(response);
    }
}
