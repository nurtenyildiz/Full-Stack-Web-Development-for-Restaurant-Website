package com.sky.service;

import com.sky.model.Order;
import com.sky.model.PaymentResponse;
import com.payoneer.Payoneer;
import com.payoneer.exception.PayoneerException;
import com.payoneer.model.checkout.Session;
import com.payoneer.param.checkout.SessionCreateParams;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class PaymentServiceImplementation implements PaymentService{
	
	
	@Value("${payoneer.api.key}")
	 private String payoneerSecretKey;

	@Override
	public PaymentResponse generatePaymentLink(Order order) throws PayoneerException {

		Payoneer.apiKey = payoneerSecretKey;

	        SessionCreateParams params = SessionCreateParams.builder()
	                .addPaymentMethodType(SessionCreateParams.PaymentMethodType.CARD)
	                .setMode(SessionCreateParams.Mode.PAYMENT)
	                .setSuccessUrl("https://sky-food.vercel.app/payment/success/"+order.getId())
	                .setCancelUrl("https://sky-food.vercel.app/cancel")
	                .addLineItem(SessionCreateParams.LineItem.builder()
	                        .setQuantity(1L)
	                        .setPriceData(SessionCreateParams.LineItem.PriceData.builder()
	                                .setCurrency("usd")
	                                .setUnitAmount((long) order.getTotalAmount()*100) // Specify the order amount in cents
	                                .setProductData(SessionCreateParams.LineItem.PriceData.ProductData.builder()
	                                        .setName("pizza burger")
	                                        .build())
	                                .build())
	                        .build())
	                .build();
	        
	        Session session = Session.create(params);
	        
	        System.out.println("session _____ " + session);
	        
	        PaymentResponse res = new PaymentResponse();
	        res.setPayment_url(session.getUrl());
	        
	        return res;
	    
	}

}
