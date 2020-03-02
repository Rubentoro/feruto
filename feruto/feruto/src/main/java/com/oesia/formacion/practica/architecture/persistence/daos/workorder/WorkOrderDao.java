package com.oesia.formacion.practica.architecture.persistence.daos.workorder;

import com.oesia.formacion.practica.architecture.domain.model.WorkOrder;
import com.oesia.formacion.practica.architecture.persistence.daos.Dao;

public interface WorkOrderDao extends Dao<WorkOrder> {
	
	void add(WorkOrder workOrder);

}
