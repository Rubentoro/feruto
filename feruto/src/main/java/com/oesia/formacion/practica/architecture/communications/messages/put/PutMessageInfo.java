package com.oesia.formacion.practica.architecture.communications.messages.put;

import com.oesia.formacion.practica.architecture.domain.managers.article.ArticleManager;
import com.oesia.formacion.practica.architecture.domain.model.Article;
import com.oesia.formacion.practica.architecture.domain.model.Colour;
import com.oesia.formacion.practica.architecture.domain.model.Size;
import com.oesia.formacion.practica.context.ContextFactory;

public class PutMessageInfo {
	
	private final int workOrder;
	private final int idArticleVendor;
	private final int idArticle;
	private final int idColor;
	private final int idSize;
	private int unds;
	private String descriptionArticle;
	
	
	public PutMessageInfo(int workOrder, int idArticleVendor, int idArticle, String descriptionArticle, int idColor, int idSize, int unds) {
		super();
		this.workOrder=workOrder;
		this.idArticleVendor = idArticleVendor;
		this.idArticle = idArticle;
		this.idColor = idColor;
		this.idSize = idSize;
		this.unds = unds;
		this.descriptionArticle = descriptionArticle;
	}




	public int getIdArticleVendor() {
		return idArticleVendor;
	}


	

	public int getIdArticle() {
		return idArticle;
	}


	


	public int getIdColor() {
		return idColor;
	}


	


	public int getIdSize() {
		return idSize;
	}


	


	public int getUnds() {
		return unds;
	}


	public void setUnds(int unds) {
		this.unds = unds;
	}
	
	

	@Override
	public String toString() {
		return "PutImpl [idArticleVendor=" + idArticleVendor + ", idArticle=" + idArticle + ", idColor=" + idColor
				+ ", idSize=" + idSize + ", unds=" + unds + ", descriptionArticle=" + descriptionArticle + "]";
	}

	public void addArticle() {
		
		Article article = new Article(workOrder, idArticleVendor, idArticle, descriptionArticle, Colour.findById(idColor), Size.findById(idSize),unds);
	
		
		ArticleManager p = ContextFactory.getContext().get(ArticleManager.class);
		p.add(article);
		System.out.println(p.findAll());
		
	}
	
	

}
