package com.company.service;

import com.company.exception.CartItemException;
import com.company.exception.ProductException;
import com.company.exception.UserException;
import com.company.modal.Cart;
import com.company.modal.CartItem;
import com.company.modal.User;
import com.company.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
