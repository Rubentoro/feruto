package com.oesia.formacion.practica.architecture.persistence.entities.workorder;


import com.oesia.formacion.practica.architecture.domain.model.WorkOrder;
import com.oesia.formacion.practica.architecture.persistence.entities.Entity;

public interface WorkOrderEntity extends Entity<WorkOrder> {

	void add(WorkOrder workOrder);
}
