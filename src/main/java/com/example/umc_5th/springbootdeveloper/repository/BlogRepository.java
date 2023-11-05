package com.example.umc_5th.springbootdeveloper.repository;

import com.example.umc_5th.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
