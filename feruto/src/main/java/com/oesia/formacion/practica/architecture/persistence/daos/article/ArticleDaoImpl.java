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

	private List<Article> data;

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
		int i = -1;
		Boolean des = false;
		
		for (Article a : data) {
			i = a.getId();
			
			if (i == article.getId()) {
				this.update(article);
				des = true;
			}
		}
		
		if(des==false)
		data.add(article);
	}
	
	@Override
	public void update(Article article) {
		Article ar = findById(article.getId());
		ar.setStock(article.getStock()+ar.getStock());
		ar.setVendor(article.getVendor());
	}

	@Override
	public Article findById(Integer id) {
		Integer i = null;
		Article article = null;

		for (Article a : data) {
			i = a.getId();
			if (id.equals(i))
				article = a;
		}

		return article;

	}

	@Override
	public Article findArticleByWorkOrderId(int id) {
		Integer i = null;
		Article article = null;

		for (Article a : data) {
			i = a.getWorkOrder();
			if (id == i)
				article = a;
		}

		return article;
	}

	@Override
	public String insertDB(Article article) {
		String query = "INSERT INTO article (workorder,vendor,id,description,colour,size,stock) values ('"+article.getWorkOrder()+"','"+article.getVendor()+"','"+article.getId()+"','"+article.getDescription()+"','"+article.getColour()+"','"+article.getSize()+"','"+article.getStock()+"';";
		return query;
	}

	@Override
	public String deleteDB(Article article) {
		String query = "DELETE FROM article where id='"+article.getId()+"';";
		return query;
	}

	@Override
	public String updateDB(Article article) {
		String query = "UPDATE article set workorder='"+article.getWorkOrder()+"', vendor='"+article.getVendor()+"', description='"+article.getDescription()+"', colour='"+article.getColour()+"', size='"+article.getSize()+"', stock='"+article.getStock()+"' where id='"+article.getId()+"';";
		return query;
	}

	@Override
	public String findByIdDB(int articleId) {
		String query = "SELECT * from article where where id='"+articleId+"';";
		return query;
	}

	@Override
	public String findAllDB() {
		String query = "SELECT * from article;";
		return query;
	}

}
