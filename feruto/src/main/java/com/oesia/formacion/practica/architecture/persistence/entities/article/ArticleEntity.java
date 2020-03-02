package com.oesia.formacion.practica.architecture.persistence.entities.article;

import com.oesia.formacion.practica.architecture.domain.model.Article;
import com.oesia.formacion.practica.architecture.domain.model.Colour;
import com.oesia.formacion.practica.architecture.domain.model.Size;
import com.oesia.formacion.practica.architecture.persistence.entities.Entity;
import com.oesia.formacion.practica.architecture.persistence.entities.vendor.VendorData;

public interface ArticleEntity extends Entity<Article> {

	Size findSizeById(Integer sizeId);
	Colour findColourById(Integer vendorId);
	VendorData findVendorById(Integer vendorId);
	void update(Article article);
	void add(Article article);
	Article findArticleById(int id);
}
