package com.oesia.formacion.practica.architecture.persistence.daos.article;

import com.oesia.formacion.practica.architecture.domain.model.Article;
import com.oesia.formacion.practica.architecture.domain.model.Colour;
import com.oesia.formacion.practica.architecture.domain.model.Size;
import com.oesia.formacion.practica.architecture.persistence.daos.Dao;
import com.oesia.formacion.practica.architecture.persistence.entities.vendor.VendorData;

public interface ArticleDao extends Dao<Article> {

	Size findSizeById(Integer sizeId);
	Colour findColorById(Integer colorId);
	VendorData findVendorById(Integer vendorId);
	void update(Article article);
	void add(Article article);
}
