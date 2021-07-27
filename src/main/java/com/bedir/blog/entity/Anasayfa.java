package com.bedir.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "anasayfa")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Anasayfa {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "blogName")
    private String BlogName;

    @Column(name = "photo")
    private String photo;

    @Column(name = "description")
    private String description;

    @Column(name = "facebook")
    private String facebook;

    @Column(name = "twitter")
    private String twitter;

    @Column(name = "linked")
    private String linked;

    @Column(name = "github")
    private String github;
}
