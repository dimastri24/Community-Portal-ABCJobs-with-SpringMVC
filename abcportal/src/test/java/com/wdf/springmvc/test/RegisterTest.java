package com.wdf.springmvc.test;

//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import static org.mockito.Mockito.when;
//import static org.mockito.Matchers.isA;
//import org.mockito.MockitoAnnotations;
//import org.mockito.runners.MockitoJUnitRunner;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import org.springframework.http.MediaType;
//
//import java.util.List;
//
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import com.google.gson.Gson;
//import com.wdf.springmvc.controllers.RegisterController;
//import com.wdf.springmvc.dao.UserDaoImpl;
//import com.wdf.springmvc.model.User;
//import com.wdf.springmvc.service.UserService;
//import com.wdf.springmvc.service.UserServiceImpl;
//
////@RunWith(MockitoJUnitRunner.class)
////@ContextConfiguration(classes=RegisterController.class)
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(locations = {"classpath:test-context.xml", "classpath:test-application-context-web.xml"})
public class RegisterTest {
	
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
////	@Mock
////	private UserDaoImpl userDao;
////	
////	@InjectMocks
////	private UserServiceImpl userService;
//	
////	@Before
////	public void setUp() throws Exception {
////		Mockito.reset(userService);
////	    MockitoAnnotations.initMocks(this);
////	    this.mockMvc = MockMvcBuilders.webAppContextSetup(context)
////				.build();
////	}
//    
////	@Before
////	public void setUp() {
////		MockitoAnnotations.initMocks(this);
////		mockMvc = MockMvcBuilders.standaloneSetup(new RegisterController())
////				.build();
////	}
//	
////    @Test
////    public void testRegister() throws Exception {
////        this.mockMvc.perform(MockMvcRequestBuilders
////                                    .post("/registerProcess")
////                                    .param("firstName","Dimas")
////        							.param("lastName","Tri")
////        							.param("email","dimas24@gmail.com")
////        							.param("pass","qwerty")
////        							.param("country","Indonesia")
////        							.param("city","Jakarta")
////        							.param("phone","1234567890")
////        							.param("company", "BiliBili"))
////                    .andDo(MockMvcResultHandlers.print())
////                    .andExpect(status().isOk());
////    }
//	
//	@Test
//	public void registerNewUser() throws Exception {
//		
//		User userObj = new User();
//		userObj.setFirstName("Ayunda");
//		userObj.setLastName("Larasati");
//		userObj.setEmail("ayularas04@gmail.com");
//		userObj.setPass("asdfgh");
//		userObj.setCountry("Indonesia");
//		userObj.setCity("Surabaya");
//		userObj.setPhone("0987654321");
//		userObj.setCompany("Lazada");
//		
//	    Gson gson = new Gson();
//	    String jsonString = gson.toJson(userObj);
//		
//		mockMvc.perform(MockMvcRequestBuilders
//				.post("/registerProcess")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(jsonString))
//        		.andExpect(status().isOk())
//        		.andDo(MockMvcResultHandlers.print())
//        		.andReturn();
//		
//	}
//	
///*	@Test
//	public void testNewRegister() throws Exception {
////		User userObj = new User();
////		userObj.setFirstName("Ayunda");
////		userObj.setLastName("Larasati");
////		userObj.setEmail("ayularas04@gmail.com");
////		userObj.setPass("asdfgh");
////		userObj.setCountry("Indonesia");
////		userObj.setCity("Surabaya");
////		userObj.setPhone("0987654321");
////		userObj.setCompany("Lazada");
//		
//		when(userService.register(isA(User.class))).thenReturn(new User());
////		User userObj = Mockito.mock(User.class);
////		when(userService.register(isA(User.class))).thenReturn(userObj);
//		
//	}*/

}
