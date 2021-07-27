package com.bedir.blog.repository;

import com.bedir.blog.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BlogRepository extends JpaRepository<Blog, Long > {
    Optional<Blog> findById(Long id);
}
