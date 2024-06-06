package com.sky.service;

import java.util.List;

import com.sky.Exception.ReviewException;
import com.sky.model.Review;
import com.sky.model.User;
import com.sky.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
