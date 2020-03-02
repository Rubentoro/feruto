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
		Integer i = null;
		WorkOrder workOrder = null;

		for (WorkOrder w : data) {
			i = w.getIdWorkOrder();
			if (id == i)
				workOrder = w;
		}

		return workOrder;
	}

	@Override
	public List<WorkOrder> findAll() {
		return data;
	}

	@Override
	public void add(WorkOrder workOrder) {
		data.add(workOrder);

	}
	


}
