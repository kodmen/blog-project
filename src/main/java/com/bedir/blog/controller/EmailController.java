package com.bedir.blog.controller;

import com.bedir.blog.service.EmailService;
import com.bedir.blog.service.dto.EmailDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/email")
@AllArgsConstructor
public class EmailController {

    private final EmailService service;

    @GetMapping
    public ResponseEntity<List<EmailDto>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<EmailDto> post(@RequestBody EmailDto dto){
        return ResponseEntity.ok(service.create(dto));
    }
}
