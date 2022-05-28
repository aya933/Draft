package com.management.college.service.implement;

import com.management.college.entity.Roles;
import com.management.college.repository.RolesRepo;
import com.management.college.services.RolesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RolesServiceImp implements RolesService {

	private final RolesRepo rolesRepo;
	@Override
	public Optional<Roles> findOne(Long id) {
		return rolesRepo.findById(id);
	}

	@Override
	public List<Roles> findall() {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

	@Override
	public void delete(Roles roles) {

	}

	@Override
	public void save(Roles roles) {

	}
}
