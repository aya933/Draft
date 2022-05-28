package com.management.college.services;


import com.management.college.entity.Roles;

import java.util.List;
import java.util.Optional;

public interface RolesService {
	 Optional<Roles> findOne(Long id);
	List<Roles> findall();
	void save(Roles roles);
	void delete(Long id);
	void delete(Roles roles);

}
