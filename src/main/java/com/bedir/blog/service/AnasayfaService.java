package com.bedir.blog.service;

import com.bedir.blog.entity.Anasayfa;
import com.bedir.blog.repository.AnasayfaRepository;
import com.bedir.blog.service.dto.AnasayfaDto;
import com.bedir.blog.service.mapper.AnasayfaMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AnasayfaService {

    private final AnasayfaRepository repository;
    private final AnasayfaMapper mapper;

    public AnasayfaDto getById(Long id){

        Optional<Anasayfa> entity = repository.findById(id);

        if (entity.isPresent()){
            return mapper.toDto(entity.get());
        }

        return AnasayfaDto.builder().build();
    }

    public AnasayfaDto Update(AnasayfaDto dto){

        Anasayfa entity = mapper.toEntity(dto);
        Anasayfa result = repository.save(entity);
        return mapper.toDto(result);

    }

}
