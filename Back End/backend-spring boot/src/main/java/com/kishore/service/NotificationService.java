package com.kishore.service;

import java.util.List;

import com.kishore.model.Notification;
import com.kishore.model.Order;
import com.kishore.model.Restaurant;
import com.kishore.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
