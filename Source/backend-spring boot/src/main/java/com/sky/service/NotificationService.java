package com.sky.service;

import java.util.List;

import com.sky.model.Notification;
import com.sky.model.Order;
import com.sky.model.Restaurant;
import com.sky.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
