package com.bedir.blog.service.mapper;

import com.bedir.blog.entity.Blog;
import com.bedir.blog.entity.Email;
import com.bedir.blog.service.dto.BlogDto;
import com.bedir.blog.service.dto.EmailDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BlogMapper {

    public Blog toEntity(BlogDto dto){
        return Blog.builder()
                .id(dto.getId())
                .numberOfReads(dto.getNumberOfReads())
                .date(dto.getDate())
                .minutesToRead(dto.getMinutesToRead())
                .photo(dto.getPhoto())
                .title(dto.getTitle())
                .build();
    }

    public BlogDto toDto(Blog entity){
        return BlogDto.builder()
                .id(entity.getId())
                .numberOfReads(entity.getNumberOfReads())
                .date(entity.getDate())
                .minutesToRead(entity.getMinutesToRead())
                .photo(entity.getPhoto())
                .title(entity.getTitle())
                .build();
    }

    public List<BlogDto> entityToListDto(List<Blog> blogs){
        List<BlogDto> dtos = new ArrayList<>();
        blogs.forEach(blog -> {
            dtos.add(toDto(blog));
        });
        return dtos;
    }

}
