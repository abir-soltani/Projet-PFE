package com.rnta.gpao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rnta.gpao.entities.Article;


@Repository
public interface ArticleRepository extends JpaRepository<Article,Long>{
	List<Article> findAll();

	boolean existsById(int id);
}
