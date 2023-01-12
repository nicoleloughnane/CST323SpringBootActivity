package com.gcu.business;

import java.util.List;

import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessInterface {

	@Override
	public void test() {
		System.out.println("Hello from the AnotherOrdersBusinessService");

	}

	@Override
	public List<OrderModel> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
