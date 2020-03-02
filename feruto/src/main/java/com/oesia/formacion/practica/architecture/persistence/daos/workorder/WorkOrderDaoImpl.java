package com.oesia.formacion.practica.architecture.persistence.daos.workorder;

import java.util.List;

import com.oesia.formacion.practica.architecture.domain.model.WorkOrder;

public class WorkOrderDaoImpl implements WorkOrderDao {

	private final List<WorkOrder> data;

	public WorkOrderDaoImpl(List<WorkOrder> data) {
		super();
		this.data = data;
	}

	@Override
	public WorkOrder findById(Integer id) {
		WorkOrder workOrder = null;
		WorkOrder workOrderById = findById(id);

//		for (WorkOrder w : data) {		
//			if (id == w.getIdWorkOrder())
//				workOrder = w;
//		}
		
		while(data.iterator().hasNext()) {
			if (id == workOrder.getIdWorkOrder())
				workOrder = workOrderById;
		}

		return workOrder;
	}

	@Override
	public List<WorkOrder> findAll() {
		return data;
	}

	@Override
	public void update(WorkOrder workOrder) {
		data.add(workOrder);

	}

}
