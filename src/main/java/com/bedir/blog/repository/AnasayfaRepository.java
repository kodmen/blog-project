package com.bedir.blog.repository;

import com.bedir.blog.entity.Anasayfa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnasayfaRepository extends JpaRepository<Anasayfa,Long> {
    Optional<Anasayfa> findById(Long id);
}
