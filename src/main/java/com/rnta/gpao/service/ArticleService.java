package com.rnta.gpao.service;

import java.util.List;

import com.rnta.gpao.entities.Article;

public interface ArticleService {
	List<Article> getAllArticle();
	Article saveArticle(Article article);
	Article getArticleById(Long id);
	void deleteArticleById(Long id);
	Article updateArticle(Article article);
	void deleteAtelierById(Long id);


}
