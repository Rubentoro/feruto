package com.oesia.formacion.practica.architecture.communications.messages.put;

public class PutImpl {
	
	private int idWorkOrder;
	private int idArticleVendor;
	private int idArticle;
	private int idColor;
	private int idSize;
	private int unds;
	
	
	public PutImpl(int idWorkOrder, int idArticleVendor, int idArticle, int idColor, int idSize, int unds) {
		super();
		this.idWorkOrder = idWorkOrder;
		this.idArticleVendor = idArticleVendor;
		this.idArticle = idArticle;
		this.idColor = idColor;
		this.idSize = idSize;
		this.unds = unds;
	}


	public int getIdWorkOrder() {
		return idWorkOrder;
	}


	public void setIdWorkOrder(int idWorkOrder) {
		this.idWorkOrder = idWorkOrder;
	}


	public int getIdArticleVendor() {
		return idArticleVendor;
	}


	public void setIdArticleVendor(int idArticleVendor) {
		this.idArticleVendor = idArticleVendor;
	}


	public int getIdArticle() {
		return idArticle;
	}


	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}


	public int getIdColor() {
		return idColor;
	}


	public void setIdColor(int idColor) {
		this.idColor = idColor;
	}


	public int getIdSize() {
		return idSize;
	}


	public void setIdSize(int idSize) {
		this.idSize = idSize;
	}


	public int getUnds() {
		return unds;
	}


	public void setUnds(int unds) {
		this.unds = unds;
	}
	
	
	
	
	

}
