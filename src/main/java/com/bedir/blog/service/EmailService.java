package com.bedir.blog.service;

import com.bedir.blog.entity.Email;
import com.bedir.blog.repository.EmailRepository;
import com.bedir.blog.service.dto.EmailDto;
import com.bedir.blog.service.mapper.EmailMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmailService {

    private final EmailRepository repository;
    private final EmailMapper mapper;

    public List<EmailDto> getAll(){
        return mapper.entityToListDto(repository.findAll());
    }

    public EmailDto create(EmailDto dto){
        Email entity = mapper.toEntity(dto);
        entity = repository.save(entity);

        return mapper.toDto(entity);
    }

}
