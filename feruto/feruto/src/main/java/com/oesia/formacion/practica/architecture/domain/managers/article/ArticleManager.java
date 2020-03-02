package com.oesia.formacion.practica.architecture.domain.managers.article;

import com.oesia.formacion.practica.architecture.domain.managers.Manager;
import com.oesia.formacion.practica.architecture.domain.model.Article;
import com.oesia.formacion.practica.architecture.domain.model.Colour;
import com.oesia.formacion.practica.architecture.domain.model.Size;
import com.oesia.formacion.practica.architecture.persistence.entities.vendor.VendorData;

public interface ArticleManager extends Manager<Article> {

	Size findSizeById(Integer sizeId);
	Colour findColourById(Integer colourId);
	VendorData findVendorById(Integer vendorId);
	void update(Article article);
	void add(Article article);

}
