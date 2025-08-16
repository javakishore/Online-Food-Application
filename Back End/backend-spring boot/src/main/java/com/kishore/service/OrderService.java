package com.kishore.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.kishore.Exception.CartException;
import com.kishore.Exception.OrderException;
import com.kishore.Exception.RestaurantException;
import com.kishore.Exception.UserException;
import com.kishore.model.Order;
import com.kishore.model.PaymentResponse;
import com.kishore.model.User;
import com.kishore.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
