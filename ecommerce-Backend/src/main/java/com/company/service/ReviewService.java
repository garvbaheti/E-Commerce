package com.company.service;

import java.util.List;

import com.company.exception.ProductException;
import com.company.modal.Review;
import com.company.modal.User;
import com.company.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req, User user) throws ProductException;

	public List<Review> getAllReview(Long productId);

}