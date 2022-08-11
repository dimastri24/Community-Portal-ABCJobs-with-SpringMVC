package com.wdf.springmvc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wdf.springmvc.model.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "Select * from users where :input IN(firstName, lastName, city, country, company)",
			nativeQuery = true)
	List<User> SearchUserByInput(@Param("input") String inp);

	Integer deleteByUserID(Integer id);

	User findByEmailAndPass(String email, String pass);

	User findByEmail(String email);

	User findByUserID(Integer id);

}
