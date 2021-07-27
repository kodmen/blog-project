package com.bedir.blog.repository;

import com.bedir.blog.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository  extends JpaRepository<Email, Long > {
}
