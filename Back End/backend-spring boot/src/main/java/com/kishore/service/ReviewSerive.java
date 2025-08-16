package com.kishore.service;

import java.util.List;

import com.kishore.Exception.ReviewException;
import com.kishore.model.Review;
import com.kishore.model.User;
import com.kishore.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
