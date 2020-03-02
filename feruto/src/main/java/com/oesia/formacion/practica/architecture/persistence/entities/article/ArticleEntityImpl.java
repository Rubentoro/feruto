package com.oesia.formacion.practica.architecture.persistence.entities.article;

import com.oesia.formacion.practica.architecture.domain.model.Article;
import com.oesia.formacion.practica.architecture.domain.model.Colour;
import com.oesia.formacion.practica.architecture.domain.model.Size;
import com.oesia.formacion.practica.architecture.persistence.daos.article.ArticleDao;
import com.oesia.formacion.practica.architecture.persistence.entities.AbstractEntity;
import com.oesia.formacion.practica.architecture.persistence.entities.vendor.VendorData;

public class ArticleEntityImpl extends AbstractEntity<Article> implements ArticleEntity {

	private final ArticleDao articleDao;

	public ArticleEntityImpl(ArticleDao articleDao) {
		super(articleDao);
		this.articleDao = articleDao;
	}

	@Override
	public Size findSizeById(Integer sizeId) {
		return articleDao.findSizeById(sizeId);
	}

	@Override
	public void update(Article article) {
		articleDao.update(article);
	}

	
	@Override
	public void add(Article article) {
		 articleDao.add(article);
		
	}

	@Override
	public Colour findColourById(Integer colourId) {
		return Colour.findById(colourId);
	}

	@Override
	public VendorData findVendorById(Integer vendorId) {
		return VendorData.findById(vendorId);
	}

	@Override
	public Article findArticleById(int id) {
		return articleDao.findById(id);
	}

	@Override
	public String insertDB(Article article) {
		return articleDao.insertDB(article);
	}

	@Override
	public String deleteDB(Article article) {
		return articleDao.deleteDB(article);
	}

	@Override
	public String updateDB(Article article) {
		return articleDao.updateDB(article);
	}

	@Override
	public String findByIdDB(int articleId) {
		return articleDao.findByIdDB(articleId);
	}

	@Override
	public String findAllDB() {
		return articleDao.findAllDB();
	}
}
