package com.oesia.formacion.practica.architecture.domain.managers.workorder;

import com.oesia.formacion.practica.architecture.domain.managers.AbstractManager;
import com.oesia.formacion.practica.architecture.domain.model.WorkOrder;
import com.oesia.formacion.practica.architecture.persistence.entities.workorder.WorkOrderEntity;

public class WorkOrderManagerImpl extends AbstractManager<WorkOrder> implements WorkOrderManager {

	private final WorkOrderEntity workOrderEntity;

	public WorkOrderManagerImpl(WorkOrderEntity workOrderEntity) {
		super(workOrderEntity);
		this.workOrderEntity = workOrderEntity;
	}

	@Override
	public void add(WorkOrder workOrder) {
		workOrderEntity.add(workOrder);
		
	}
	
	public void findById(WorkOrder workOrder) {
		workOrderEntity.findById(workOrder.getIdWorkOrder());
	}

	
	
	
}