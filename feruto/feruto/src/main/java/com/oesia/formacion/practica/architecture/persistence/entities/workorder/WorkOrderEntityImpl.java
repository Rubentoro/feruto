package com.oesia.formacion.practica.architecture.persistence.entities.workorder;


import com.oesia.formacion.practica.architecture.domain.model.WorkOrder;
import com.oesia.formacion.practica.architecture.persistence.daos.Dao;
import com.oesia.formacion.practica.architecture.persistence.daos.workorder.WorkOrderDao;
import com.oesia.formacion.practica.architecture.persistence.entities.AbstractEntity;

public class WorkOrderEntityImpl extends AbstractEntity<WorkOrder> implements WorkOrderEntity {

	private final WorkOrderDao workOrderDao;
	
	
	public WorkOrderEntityImpl(Dao<WorkOrder> dao, WorkOrderDao workOrderDao) {
		super(dao);
		this.workOrderDao = workOrderDao;
	}


	@Override
	public void add(WorkOrder workOrder) {
		workOrderDao.add(workOrder);
	}






	
	
}
