package com.bedir.blog.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BlogDto {

    private Long id;
    private String photo;
    private String title;
    private LocalDate date;
    private Long numberOfReads;
    private int minutesToRead;
}
