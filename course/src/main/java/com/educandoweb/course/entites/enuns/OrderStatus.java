package com.educandoweb.course.entites.enuns;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DILIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;		
	}
	public int getCod() {
		return code;
	}
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value:OrderStatus.values()) {
		if(value.getCod()== code) {
			return value;
		}
		}
		throw new IllegalArgumentException("Invalid OrderStatus Cod");
	}
	
}
