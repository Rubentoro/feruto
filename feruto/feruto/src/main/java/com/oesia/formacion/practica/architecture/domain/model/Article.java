package com.oesia.formacion.practica.architecture.domain.model;

import com.oesia.formacion.practica.architecture.persistence.entities.vendor.VendorData;

public class Article {
	
	private final WorkOrder workOrder;
	private final VendorData vendor;
	private final int id;
	private String description;
	private final Colour colour;
	private final Size size;
	private int stock;


	public Article(WorkOrder workOrder, VendorData vendor, int id, String description, Colour colour, Size size,
			int stock) {
		super();
		this.workOrder = workOrder;
		this.vendor = vendor;
		this.id = id;
		this.description = description;
		this.colour = colour;
		this.size = size;
		this.stock = stock;
	}


	public String getDescription() {
		return description;
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


	public WorkOrder getWorkOrder() {
		return workOrder;
	}


	public VendorData getVendor() {
		return vendor;
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

	public VendorData findVendorById(Integer id) {
		return vendor.findById(id);
	}
	
	public Colour findColourById(Integer id) {
		return colour.findById(id);
	}
	

}
