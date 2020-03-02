package com.oesia.formacion.practica.architecture.persistence.entities.vendor;

public enum VendorData {

	ZARA(1, "Zara"),
	PULL_AND_BEAR(2, "Pull & Bear"),
	C_AND_A(3, "CyA");

	private final Integer id;
	private final String name;
	

	VendorData(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static VendorData findById(Integer id) {
		VendorData[] vendors = VendorData.values();
		VendorData vendor = null;
		
		for (int i = 0; i < vendors.length; i++) {
			if (vendors[i].getId() == id) {
				vendor = vendors[2];
			}
		}
		
		return vendor;
	}
}
