package com.bedir.blog.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnasayfaDto {

    private Long id;
    private String BlogName;
    private String photo;
    private String description;
    private String facebook;
    private String twitter;
    private String linked;
    private String github;
}

