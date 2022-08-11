package com.wdf.springmvc.service;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import com.wdf.springmvc.config.JpaConfig;
import com.wdf.springmvc.config.WebMvcConfig;
import com.wdf.springmvc.model.User;
import com.wdf.springmvc.model.UserDto;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@ContextConfiguration(classes= {WebMvcConfig.class, JpaConfig.class})
public class ServiceLoginTest {
	
	@Autowired
	UserService service;

	@Test
	public void testValidLoginUser() {
		//fail("Not yet implemented");
		UserDto dto = new UserDto();
		dto.setEmailId("agus22@gmail.com");
		dto.setPassword("asdfg");
		User result = service.loginUser(dto);
		
		assertTrue(result.getEmail().equals(dto.getEmailId()));
	}
	
	@Test
	public void testInvalidLoginUser() {
		UserDto dto = new UserDto();
		dto.setEmailId("xyz@gmail.com");
		dto.setPassword("asdfgh");
		User result = service.loginUser(dto);
		
		assertEquals(null, result);
		
	}

}
