package com.capstone.ShoppingFeedback.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FeedbackResponse")
public class FeedbackResponse {
	private int cartId;
	private int userId;
	private List<Response> response;
	private float averageRating;
	private String comments;
	public FeedbackResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public List<Response> getResponse() {
		return response;
	}
	public void setResponse(List<Response> response) {
		this.response = response;
	}
	public float getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "FeedbackResponse [cartId=" + cartId + ", userId=" + userId + ", response=" + response
				+ ", averageRating=" + averageRating + ", comments=" + comments + "]";
	}	
}
