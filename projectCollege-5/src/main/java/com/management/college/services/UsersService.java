package com.management.college.services;

import com.management.college.entity.Users;

import java.util.List;
import java.util.Optional;

public interface UsersService {
	 Optional<Users> findOne(Long id);
	List<Users> findall();
	void save(Users users);
	void delete(Long id);
	void  delete(Users user);
	Users findByEmail(String email);



}
