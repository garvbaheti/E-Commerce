package com.company.service;

import java.util.List;

import com.company.exception.OrderException;
import com.company.modal.Address;
import com.company.modal.Order;
import com.company.modal.User;

public interface OrderService {

	public Order createOrder(User user, Address shippingAdress);

	public Order findOrderById(Long orderId) throws OrderException;

	public List<Order> usersOrderHistory(Long userId);

	public Order placedOrder(Long orderId) throws OrderException;

	public Order confirmedOrder(Long orderId) throws OrderException;

	public Order shippedOrder(Long orderId) throws OrderException;

	public Order deliveredOrder(Long orderId) throws OrderException;

	public Order cancledOrder(Long orderId) throws OrderException;

	public List<Order> getAllOrders();

	public void deleteOrder(Long orderId) throws OrderException;

}
