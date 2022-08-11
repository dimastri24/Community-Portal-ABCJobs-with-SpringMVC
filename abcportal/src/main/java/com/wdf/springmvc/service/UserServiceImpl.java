package com.wdf.springmvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdf.springmvc.dao.UserDao;
import com.wdf.springmvc.model.User;
import com.wdf.springmvc.model.UserDto;
import com.wdf.springmvc.repo.UserDtoRepository;
import com.wdf.springmvc.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

//	@Autowired
//	public UserDao userDao;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserDtoRepository userDtoRepo;

//	public int register(User user) {
//		//return userDao.register(user); //- NO of records affected - 0 - insert unsuccessful, 1  - Success
//		userRepo.saveAndFlush(user);// Returns the user object with new user id. Because User ID is an auto increment field
//		return user.getUserID();//  return user id because method's return type is int. We can change it the way we want 
//	}
	public User register(User user) {
		return userRepo.save(user);
	}

	
//	public List<User> showAllUsers() {
//		return userDao.showAllUsers();
//	}
	public List<User> showAllUsers() {
		return userRepo.findAll();
	}

	
//	public List<User> findUserById(int id) {
//		return userDao.findUserById(id);
//	}
//	public Optional<User> findUserById(Integer id) {
//		return Optional.of(userRepo.findByUserID(id));
//	}
	public User findUserById(int id) {
		return userRepo.findByUserID(id);
	}

	
//	public int updateUser(User user) {
//		return userDao.updateUser(user);
//	}
//	public User updateUser(User user) {
//		return repo.save(user);
//	}
	public void updateUser(User user) {
		User newUser = userRepo.findByUserID(user.getUserID());
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setEmail(user.getEmail());
		newUser.setPass(user.getPass());
		newUser.setCountry(user.getCountry());
		newUser.setCity(user.getCity());
		newUser.setPhone(user.getPhone());
		newUser.setCompany(user.getCompany());
		//newUser.setRole(user.getRole());
		userRepo.save(newUser);
	}

	
//	public int deleteUser(int id) {
//		return userDao.deleteUser(id);
//	}
	public Integer deleteUser(Integer id) {
		return userRepo.deleteByUserID(id);
	}

	
	public List<User> searchUser(String inp) {
//		List<User> users = userDao.searchUser(inp);
//		System.out.println(users);
		List<User> users = userRepo.SearchUserByInput(inp);
		return users;
	}
//	public Optional<User> searchUser(String inp) {
//		Optional<User> users = userRepo.SearchUserByInput(inp);
//		return users;
//	}

	
//	public User loginUser(UserDto loginDto) throws Exception {
//		User user = userDao.login(loginDto);
//		System.out.println(user);
//		if (user == null) {
//			return null;
//		}
//		return user;
//	}
//	public UserDto loginUser(String email, String pass) {
//		UserDto user = repo.findByEmailIdAndPassword(email, pass);
//		System.out.println(user);
//		if (user == null) {
//			return null;
//		}
//		return user;
//	}
	public User loginUser(UserDto loginDto) {
		User user = userRepo.findByEmailAndPass(loginDto.getEmailId(), loginDto.getPassword());
		System.out.println(user);
		if (user == null) {
			return null;
		}
		return user;
	}

	
//	public int updateProfile(User user) {
//		return userDao.updateProfile(user);
//	}
//	public User updateProfile(User user) {
//		return repo.save(user);
//	}
	public void updateProfile(User user) {
		User newUser = userRepo.findByUserID(user.getUserID());
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setCountry(user.getCountry());
		newUser.setCity(user.getCity());
		newUser.setPhone(user.getPhone());
		newUser.setCompany(user.getCompany());
		userRepo.save(newUser);
	}

//	public int resetPassword(UserDto user) {
//		return userDao.resetPassword(user);
//	}
	public void resetPassword(UserDto userDto) {
		User user = userRepo.findByEmail(userDto.getEmailId());
		user.setPass(userDto.getPassword());
		userRepo.save(user);
	}

	public UserDto findByEmailId(String email) {
		return userDtoRepo.findByEmailId(email);
		//return userDao.findByEmail(email);
	}
	
	public User findByEmail (String email) {
		User user = userRepo.findByEmail(email);
		if (user == null) {
			return null;
		}
		
		return user;
	}

//	public int updateResetTokenPassword(UserDto userDto) {
//
//		return userDao.resetTokenPassword(userDto);
//	}
	public void updateResetTokenPassword(UserDto userDto) {
		User user = userRepo.findByEmail(userDto.getEmailId());
		user.setResetPasswordToken(userDto.getResetPasswordToken());
		userRepo.save(user);
	}

	public UserDto getByResetTokenPassword(String token) {
		return userDtoRepo.findByResetPasswordToken(token);
		//return userDao.findByResetTokenPassword(token);
	}

}
