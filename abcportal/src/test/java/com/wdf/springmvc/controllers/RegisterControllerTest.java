package com.wdf.springmvc.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import javax.servlet.ServletContext;

import com.wdf.springmvc.config.JpaConfig;
import com.wdf.springmvc.config.WebMvcConfig;
import com.wdf.springmvc.model.User;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@ContextConfiguration(classes= {WebMvcConfig.class, JpaConfig.class})
class RegisterControllerTest {
	
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext wac;
	
	@BeforeEach
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void givenWac_whenServletContext_thenItProvidesRegisterController() {
	    ServletContext servletContext = wac.getServletContext();
	    
	    assertNotNull(servletContext);
	    assertTrue(servletContext instanceof MockServletContext);
	    assertNotNull(wac.getBean("registerController"));
	}
	
	@Test
	void testShowRegister() throws Exception{
		mockMvc.perform(get("/register"))
		.andExpect(status().isOk())
        .andExpect(view().name("register"))
        .andDo(MockMvcResultHandlers.print())
        .andReturn();
	}
	
//	@Test
//	void testValidAddUser() throws Exception {
//		
//		User user = new User(null, "Layla", "Lilyana", "laylya@gmail.com", "qwerty", 
//				"Germany", "Germany", "1234567890", "AlfaMidi", 1);
//		
//		this.mockMvc.perform(post("/registerProcess"))
//		.andExpect(status().isOk())
//		.andExpect(view().name("thankyou"))
//		.andReturn();
//		
//	}

}
