package com.kishore.service;

import com.stripe.exception.StripeException;
import com.kishore.model.Order;
import com.kishore.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
