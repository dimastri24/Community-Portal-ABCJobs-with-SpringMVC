package com.wdf.springmvc.test;

//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.google.gson.Gson;
//import com.wdf.springmvc.model.User;
//import com.wdf.springmvc.service.UserService;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(locations = {"classpath:test-context.xml", "classpath:test-application-context-web.xml"})
public class ViewProfileTest {
	
//	private MockMvc mockMvc;
//	
//	@Mock
//	private UserService service;
//	
//	@Autowired
//	private WebApplicationContext context;
//	
//	@Before
//	public void setUp() {
//		MockitoAnnotations.initMocks(this);
//		this.mockMvc = MockMvcBuilders.webAppContextSetup(context)
//				.build();
//	}
//	
//	@Test
//	public void seeProfile() throws Exception {
//		
//		User userObj = new User();
//		userObj.setUserID(5);
//        
//	    Gson gson = new Gson();
//	    String jsonString = gson.toJson(userObj);
//	    
//		mockMvc.perform(MockMvcRequestBuilders
//				.get("/profile")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(jsonString))
//        		.andExpect(status().isOk())
//        		.andDo(MockMvcResultHandlers.print())
//        		.andReturn();
//		
//	}

}
