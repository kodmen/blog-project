package com.bedir.blog.service.mapper;

import com.bedir.blog.entity.Anasayfa;
import com.bedir.blog.entity.Email;
import com.bedir.blog.service.dto.AnasayfaDto;
import com.bedir.blog.service.dto.EmailDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmailMapper {

    public Email toEntity(EmailDto dto){
        return Email.builder()
                .email(dto.getEmail())
                .id(dto.getId())
                .build();
    }

    public EmailDto toDto(Email entity){
        return EmailDto.builder()
                .email(entity.getEmail())
                .id(entity.getId())
                .build();
    }

    public List<EmailDto> entityToListDto(List<Email> emails){
        List<EmailDto> dtos = new ArrayList<>();
        emails.forEach(email -> {
            dtos.add(toDto(email));
        });
        return dtos;
    }

}
