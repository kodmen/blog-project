package com.bedir.blog.service.mapper;

import com.bedir.blog.entity.Anasayfa;
import com.bedir.blog.service.dto.AnasayfaDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnasayfaMapper {

    public Anasayfa toEntity(AnasayfaDto dto){
        return Anasayfa.builder()
                .id(dto.getId())
                .BlogName(dto.getBlogName())
                .description(dto.getDescription())
                .facebook(dto.getFacebook())
                .github(dto.getGithub())
                .linked(dto.getLinked())
                .photo(dto.getPhoto())
                .twitter(dto.getTwitter())
                .build();
    }

    public AnasayfaDto toDto(Anasayfa entity){
        return AnasayfaDto.builder()
                .id(entity.getId())
                .BlogName(entity.getBlogName())
                .description(entity.getDescription())
                .facebook(entity.getFacebook())
                .github(entity.getGithub())
                .linked(entity.getLinked())
                .photo(entity.getPhoto())
                .twitter(entity.getTwitter())
                .build();
    }

    public List<AnasayfaDto> entityToDtoList(List<Anasayfa> entitys){
        List<AnasayfaDto> dtos = new ArrayList<>();
        entitys.forEach(entity ->{
            dtos.add(toDto(entity));
        });
        return dtos;
    }
}
