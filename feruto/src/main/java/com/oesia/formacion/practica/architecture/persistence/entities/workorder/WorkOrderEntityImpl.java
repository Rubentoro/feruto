package com.oesia.formacion.practica.architecture.persistence.entities.workorder;


import com.oesia.formacion.practica.architecture.domain.model.WorkOrder;
import com.oesia.formacion.practica.architecture.persistence.daos.workorder.WorkOrderDao;
import com.oesia.formacion.practica.architecture.persistence.entities.AbstractEntity;

public class WorkOrderEntityImpl extends AbstractEntity<WorkOrder> implements WorkOrderEntity {

	private final WorkOrderDao workOrderDao;
	
	public WorkOrderEntityImpl( WorkOrderDao workOrderDao) {
		super(workOrderDao);
		this.workOrderDao = workOrderDao;
	}


	@Override
	public void update(WorkOrder workOrder) {
		workOrderDao.update(workOrder);
	}






	
	
}
