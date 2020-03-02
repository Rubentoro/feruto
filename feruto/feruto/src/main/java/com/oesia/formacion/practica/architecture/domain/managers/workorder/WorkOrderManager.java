package com.oesia.formacion.practica.architecture.domain.managers.workorder;

import com.oesia.formacion.practica.architecture.domain.managers.Manager;
import com.oesia.formacion.practica.architecture.domain.model.Article;
import com.oesia.formacion.practica.architecture.domain.model.Colour;
import com.oesia.formacion.practica.architecture.domain.model.Size;
import com.oesia.formacion.practica.architecture.domain.model.WorkOrder;
import com.oesia.formacion.practica.architecture.persistence.entities.vendor.VendorData;

public interface WorkOrderManager extends Manager<WorkOrder> {

	void add(WorkOrder workOrder);

}
