package com.wdf.springmvc.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.wdf.springmvc.config.JpaConfig;
import com.wdf.springmvc.config.WebMvcConfig;
import com.wdf.springmvc.model.User;
import com.wdf.springmvc.model.UserDto;
import com.wdf.springmvc.repo.UserRepository;

@ExtendWith(MockitoExtension.class)
@WebAppConfiguration
@ContextConfiguration(classes= {WebMvcConfig.class, JpaConfig.class})
class ServiceCRUDTest {
	
	@Mock
	UserRepository userRepository;
	
	@InjectMocks
	UserServiceImpl userService;

	@Test
	void testRegister() {
		User user = new User(null, "Layla", "Lilyana", "laylya@gmail.com", "qwerty", "Germany", "Germany", "1234567890", "AlfaMidi", 1);
		
		when(userRepository.saveAndFlush(user)).thenReturn(user);
		
		User saveduser = userService.register(user);
		
		//assertThat(saveduser, notNull());
		assertNotNull(saveduser);
		
		verify(userRepository).saveAndFlush(any(User.class));
	}

	@Test
	void testUpdateUser() {
		User user = new User();
		user.setUserID(3);
		user.setPhone("384726428");
		
		//ArgumentCaptor<User> updateuser = ArgumentCaptor.forClass(User.class);
		
		when(userRepository.findByUserID(user.getUserID())).thenReturn(user);
		//doNothing().when(userRepository.save(user));
		
		userService.updateUser(user);
		
		assertEquals(user.getPhone(), "384726428");
		
		verify(userRepository).save(any(User.class));
	}

	@Test
	void testDeleteUser() {
		Integer userId = 12;
		userService.deleteUser(userId);
		
		verify(userRepository, times(1)).deleteByUserID(userId);
	}

	@Test
	void testUpdateProfile() {
		User user = new User();
		user.setUserID(3);
		user.setCompany("Djaroem");
		
		when(userRepository.findByUserID(user.getUserID())).thenReturn(user);
		
		userService.updateUser(user);
		
		assertEquals(user.getCompany(), "Djaroem");
		
		verify(userRepository).save(any(User.class));
	}

	@Test
	void testResetPassword() {
		UserDto user = new UserDto();
		user.setEmailId("agus22@gmail.com");
		user.setPassword("lkjhg");
		
		when(userRepository.findByEmail(user.getEmailId())).thenReturn(new User());
		
		userService.updateResetTokenPassword(user);
		
		assertEquals(user.getPassword(), "lkjhg");
		
		verify(userRepository).save(any(User.class));
	}

	@Test
	void testUpdateResetTokenPassword() {
//		User user = new User();
//		user.setEmail("agus22@gmail.com");
//		user.setResetPasswordToken("AJS29JC8JC");
		
		UserDto user = new UserDto();
		user.setEmailId("agus22@gmail.com");
		user.setResetPasswordToken("AJS29JC8JC");
		
		when(userRepository.findByEmail(user.getEmailId())).thenReturn(new User());
		
		userService.updateResetTokenPassword(user);
		
		verify(userRepository).save(any(User.class));
	}

}
