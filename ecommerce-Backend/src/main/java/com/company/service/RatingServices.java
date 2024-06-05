package com.company.service;

import java.util.List;

import com.company.exception.ProductException;
import com.company.modal.Rating;
import com.company.modal.User;
import com.company.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
