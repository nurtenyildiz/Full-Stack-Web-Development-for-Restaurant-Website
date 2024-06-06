package com.sky.service;

import com.payoneer.exception.PayoneerException;
import com.sky.model.Order;
import com.sky.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws PayoneerException;

}
