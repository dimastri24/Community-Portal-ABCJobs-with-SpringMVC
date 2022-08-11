package com.wdf.springmvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wdf.springmvc.model.UserDto;

@Repository
public interface UserDtoRepository extends JpaRepository<UserDto, Long> {
	
	UserDto findByEmailIdAndPassword(String email, String pass);
	
	UserDto findByEmailId (String email);
	
	UserDto findByResetPasswordToken(String token);

}
