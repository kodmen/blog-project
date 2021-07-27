package com.bedir.blog.service;

import com.bedir.blog.entity.Blog;
import com.bedir.blog.repository.BlogRepository;
import com.bedir.blog.service.dto.BlogDto;
import com.bedir.blog.service.mapper.BlogMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BlogService {

    private final BlogRepository repository;
    private final BlogMapper mapper;

    public BlogDto create(BlogDto dto){
        Blog result = repository.save(mapper.toEntity(dto));
        return mapper.toDto(result);
    }

    public List<BlogDto> getAll(){
        List<BlogDto> dtos = mapper.entityToListDto(repository.findAll());
        return dtos;
    }

    public BlogDto getById(Long id){
        Optional<Blog> entity = repository.findById(id);
        if (entity.isPresent()){
            return mapper.toDto(entity.get());
        }
        return BlogDto.builder().build();
    }

    public BlogDto update(BlogDto dto){

        Boolean existEntity = repository.existsById(dto.getId());
        if (existEntity){
            Blog entity = mapper.toEntity(dto);
            entity = repository.save(entity);
            return mapper.toDto(entity);
        }
        return BlogDto.builder().build();
    }

    public Boolean delete(Long id){
        Optional<Blog> entity = repository.findById(id);

        if (entity.isPresent()){
            repository.delete(entity.get());
            return true;
        }
        return false;
    }
}
