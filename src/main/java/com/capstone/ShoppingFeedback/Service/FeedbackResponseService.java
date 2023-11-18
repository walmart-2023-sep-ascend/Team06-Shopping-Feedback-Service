package com.capstone.ShoppingFeedback.Service;

import java.util.List;
import com.capstone.ShoppingFeedback.model.FeedbackResponse;

public interface FeedbackResponseService {
	public List<FeedbackResponse> getAllResponses();
	public FeedbackResponse getResponsebyId(int cartid);
	public FeedbackResponse addResponse(FeedbackResponse res);
}
