package com.oesia.formacion.practica.architecture.persistence.daos.article;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.oesia.formacion.practica.architecture.domain.model.Article;
import com.oesia.formacion.practica.architecture.domain.model.Colour;
import com.oesia.formacion.practica.architecture.domain.model.Size;
import com.oesia.formacion.practica.architecture.persistence.entities.vendor.VendorData;

public class ArticleDaoImpl implements ArticleDao {

	private static final Logger LOGGER = Logger.getLogger(ArticleDaoImpl.class);

	private final List<Article> data;

	public ArticleDaoImpl() {
		data = new ArrayList<Article>();
	}

	@Override
	public List<Article> findAll() {
		return data;
	}

	@Override
	public Size findSizeById(Integer sizeId) {
		return Size.findById(sizeId);
	}
	
	@Override
	public VendorData findVendorById(Integer vendorId) {
		return VendorData.findById(vendorId);
	}
	
	@Override
	public Colour findColorById(Integer colorId) {
		return Colour.findById(colorId);
	}


	@Override
	public void add(Article article) {
		data.add(article);
	}
	
	@Override
	public void update(Article article) {
		Article ar = data.get(article.getId());
		ar.setStock(article.getStock() + ar.getStock());
		
	}

	@Override
	public Article findById(Integer id) {
		Integer i = null;
		Article article = null;

		for (Article a : data) {
			i = a.getId();
			if (id == i)
				article = a;
		}

		return article;

	}

	
	


}
