package com.sky.service;

import java.util.List;

import com.payoneer.exception.PayoneerException;
import com.sky.Exception.CartException;
import com.sky.Exception.OrderException;
import com.sky.Exception.RestaurantException;
import com.sky.Exception.UserException;
import com.sky.model.Order;
import com.sky.model.PaymentResponse;
import com.sky.model.User;
import com.sky.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, PayoneerException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
