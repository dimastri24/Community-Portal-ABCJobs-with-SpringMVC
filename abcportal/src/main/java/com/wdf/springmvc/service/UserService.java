package com.wdf.springmvc.service;

import java.util.List;
import java.util.Optional;

import com.wdf.springmvc.model.User;
import com.wdf.springmvc.model.UserDto;

public interface UserService {
	
	//public int register(User user);
	public User register(User user);
	
	public List<User> showAllUsers();
	
	//public List<User> findUserById(int id);
	//public Optional<User> findUserById(Integer id);
	public User findUserById(int id);
	
	//public int updateUser(User user);
	//public User updateUser(User user);
	public void updateUser(User user);
	
	//public int deleteUser(int id);
	public Integer deleteUser(Integer id);
	
	public List<User> searchUser(String inp);
	//public Optional<User> searchUser(String inp);
	
	//public User loginUser(UserDto loginDto) throws Exception;
	//public UserDto loginUser(String email, String pass);
	public User loginUser(UserDto loginDto);
	
	//public int updateProfile(User user);
	//public User updateProfile(User user);
	public void updateProfile(User user);
	
	//public int resetPassword(UserDto user);
	public void resetPassword(UserDto userDto);
	
	public UserDto findByEmailId (String email);
	
	public User findByEmail (String email);
	
	//public int updateResetTokenPassword(UserDto userDto);
	public void updateResetTokenPassword(UserDto userDto);
	
	public UserDto getByResetTokenPassword(String token);
	
	

}
