package com.capstone.ShoppingFeedback;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.capstone.ShoppingFeedback.model.FeedbackResponse;
import com.capstone.ShoppingFeedback.model.Response;

import java.util.List;
import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShoppingFeedbackApplicationTests {
	
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
	@Before
	private void setup() {
		mockMvc=MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void addResponseTest() {
		List<Response> responselist= new ArrayList<Response>();
		//responselist.add(1, null);
		//Response responselist=new Response();
		//responselist.add(5);
		FeedbackResponse response=new FeedbackResponse();
		response.setCartId(101);
		response.setUserId(1234);
		//response.setResponse(new List<Response> responselist);
		//response.setResponse([4,5,6,7,2]);
		response.setAverageRating(4.5f);
		response.setComments("Good experience");
	}

}
