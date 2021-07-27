package com.bedir.blog.controller;

import com.bedir.blog.service.AnasayfaService;
import com.bedir.blog.service.dto.AnasayfaDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anasayfa")
@AllArgsConstructor
public class AnasayfaController {

    private final AnasayfaService service;

    @GetMapping
    public ResponseEntity<AnasayfaDto> get(){
        return ResponseEntity.ok(service.getById(1L));
    }

}
