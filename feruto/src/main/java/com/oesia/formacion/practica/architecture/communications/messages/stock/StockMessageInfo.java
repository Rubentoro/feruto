package com.oesia.formacion.practica.architecture.communications.messages.stock;

import com.oesia.formacion.practica.architecture.domain.model.Colour;
import com.oesia.formacion.practica.architecture.domain.model.Size;

public class StockMessageInfo {

	private int idArticle;
	private Colour idColor;
	private Size idSize;
	private int unds;
	private String descriptionArticle;

	public StockMessageInfo(int idArticle, Colour idColor, Size idSize, int unds, String descriptionArticle) {
		super();
		this.idArticle = idArticle;
		this.idColor = idColor;
		this.idSize = idSize;
		this.unds = unds;
		this.descriptionArticle = descriptionArticle;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public Colour getIdColor() {
		return idColor;
	}

	public void setIdColor(Colour idColor) {
		this.idColor = idColor;
	}

	public Size getIdSize() {
		return idSize;
	}

	public void setIdSize(Size idSize) {
		this.idSize = idSize;
	}

	public int getUnds() {
		return unds;
	}

	public void setUnds(int unds) {
		this.unds = unds;
	}

	public String getDescriptionArticle() {
		return descriptionArticle;
	}

	public void setDescriptionArticle(String descriptionArticle) {
		this.descriptionArticle = descriptionArticle;
	}

	@Override
	public String toString() {
		return "id=" + idArticle + ", color=" + idColor + ", size=" + idSize + ", stock="
				+ unds + ", description=" + descriptionArticle;
	}

	
	
}
