package com.oesia.formacion.practica.architecture.domain.managers.article;

import com.oesia.formacion.practica.architecture.domain.managers.AbstractManager;
import com.oesia.formacion.practica.architecture.domain.model.Article;
import com.oesia.formacion.practica.architecture.domain.model.Colour;
import com.oesia.formacion.practica.architecture.domain.model.Size;
import com.oesia.formacion.practica.architecture.persistence.entities.article.ArticleEntity;
import com.oesia.formacion.practica.architecture.persistence.entities.vendor.VendorData;


public class ArticleManagerImpl extends AbstractManager<Article> implements ArticleManager {

	private ArticleEntity articleEntity ;

	public ArticleManagerImpl(ArticleEntity articleEntity) {
		super(articleEntity);
		this.articleEntity = articleEntity;
	}

	@Override
	public Size findSizeById(Integer sizeId) {
		return articleEntity.findSizeById(sizeId);
	}

	@Override
	public void add(Article article) {
		articleEntity.add(article);
	}

	@Override
	public Colour findColourById(Integer colourId) {
		return articleEntity.findColourById(colourId);
	}

	@Override
	public VendorData findVendorById(Integer vendorId) {
		return articleEntity.findVendorById(vendorId);
	}

	@Override
	public void update(Article article) {
		
		Article ar = findById(article.getId());
		article.setStock(article.getStock() + ar.getStock());	
		ar = article;
		articleEntity.update(ar);
		
	}

	@Override
	public Article findArticleById(int id) {
		
		return articleEntity.findById(id);
	}

	@Override
	public String insertDB(Article article) {
		return articleEntity.insertDB(article);
	}

	@Override
	public String deleteDB(Article article) {
		return articleEntity.deleteDB(article);
	}

	@Override
	public String updateDB(Article article) {
		return articleEntity.deleteDB(article);
	}

	@Override
	public String findByIdDB(int articleId) {
		return articleEntity.findByIdDB(articleId);
	}

	@Override
	public String findAllDB() {
		return articleEntity.findAllDB();
	}
}