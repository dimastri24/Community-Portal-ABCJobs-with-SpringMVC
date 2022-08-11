package com.wdf.springmvc.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

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
class ServiceFindByTest {

	@Autowired
	UserService userService;
	
	@Test
	void testShowAllUsers() {
		List<User> listuser = userService.showAllUsers();
		
		assertNotNull(listuser);
	}

	@Test
	void testValidFindUserById() {
		User user = userService.findUserById(5);
		
		assertTrue(user.getEmail().equals("onya77@gmail.com"));
	}
	
	@Test
	void testInvalidFindUserById() {
		User user = userService.findUserById(78);
		
		assertNull(user);
	}

	@Test
	void testValidSearchUser() {
		List<User> users = userService.searchUser("America");
		
		assertThat(users, hasSize(3));
	}
	
	@Test
	void testInvalidSearchUser() {
		List<User> users = userService.searchUser("Jamaludin");
		
		assertThat(users, empty());
	}

	@Test
	void testValidFindByEmailId() {
		UserDto user = userService.findByEmailId("hitotadano@gmail.com");
		
		assertThat(user.getEmailId(), equalTo("hitotadano@gmail.com"));
	}
	
	@Test
	void testInvalidFindByEmailId() {
		UserDto user = userService.findByEmailId("abc@gmail.com");
		
		assertNull(user);
	}

	@Test
	void testValidFindByEmail() {
		User user = userService.findByEmail("hitotadano@gmail.com");
		
		assertThat(user.getEmail(), equalTo("hitotadano@gmail.com"));
	}
	
	@Test
	void testInvalidFindByEmail() {
		User user = userService.findByEmail("abc@gmail.com");
		
		assertNull(user);
	}

	@Test
	void testValidGetByResetTokenPassword() {
		UserDto user = userService.getByResetTokenPassword("VL2VZY7Qk8");
		
		assertThat(user.getEmailId(), equalTo("eithandarkhaing@googlemail.com"));
	}
	
	@Test
	void testInvalidGetByResetTokenPassword() {
		UserDto user = userService.getByResetTokenPassword("ZMXCW2D281");
		
		assertNull(user);
	}

}
