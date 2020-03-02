package com.oesia.formacion.practica.architecture.domain.model;


public class Article {

	private final int workOrder;
	private  int vendor;
	private final int id;
	private String description;
	private final Colour colour;
	private final Size size;
	private int stock;

	//TODO: Ok pero con builder estaría mejor
	

	public String getDescription() {
		return description;
	}

	public Article(int workOrder, int vendor, int id, String description, Colour colour, Size size, int stock) {
		super();
		this.workOrder = workOrder;
		this.vendor = vendor;
		this.id = id;
		this.description = description;
		this.colour = colour;
		this.size = size;
		this.stock = stock;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getVendor() {
		return vendor;
	}


	public void setVendor(int vendor) {
		this.vendor = vendor;
	}

	public int getId() {
		return id;
	}

	public Colour getColour() {
		return colour;
	}

	public Size getSize() {
		return size;
	}

	


	public int getWorkOrder() {
		return workOrder;
	}

	@Override
	public String toString() {
		return "Article [vendor=" + vendor + ", id=" + id + ", description=" + description + ", colour=" + colour
				+ ", size=" + size + ", stock=" + stock + "]";
	}
	
	

}
