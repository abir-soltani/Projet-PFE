package com.rnta.gpao.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rnta.gpao.entities.Article;
import com.rnta.gpao.repository.ArticleRepository;
@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleRepository  articleRepository;
	@Override
	public List<Article> getAllArticle() {
		return articleRepository.findAll();
	}

	@Override
	public Article saveArticle(Article article) {
		if(article.getId() != null && articleRepository.existsById(article.getId())) {
			throw new EntityExistsException("There is already existing entity with such ID in the database.");
		}
		return articleRepository.save(article);
		
	}

	@Override
	public Article getArticleById(Long id) {
		Optional<Article> optional = articleRepository.findById(id);
		Article article = null;
		if(optional.isPresent()) {
			article =  optional.get();
		}else {
			throw new RuntimeException("article n'est pas trouvée par l'id ::"+ id);
		}
		return article;
	}

	@Override
	public void deleteArticleById(Long id) {
		this.articleRepository.deleteById(id);
		
	}

	@Override
	public Article updateArticle(Article article) {
		return articleRepository.save(article);
	}

	@Override
	public void deleteAtelierById(Long id) {
	
		articleRepository.deleteById(id);
			
	}
	

}
