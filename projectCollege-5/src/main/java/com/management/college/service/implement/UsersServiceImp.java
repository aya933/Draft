package com.management.college.service.implement;
import com.management.college.entity.Users;
import com.management.college.repository.UsersRepo;
import com.management.college.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UsersServiceImp implements UsersService {

    private final UsersRepo userrepo;

	@Override
	public Optional<Users> findOne(Long id) {
		return userrepo.findById(id);
	}

	@Override
	public List<Users> findall() {
		return userrepo.findAll();
	}

	@Override
	public void save(Users users) {
		userrepo.save(users);
	}

	@Override
	public void delete(Long id) {
		userrepo.deleteById(id);
	}

	@Override
	public void delete(Users user) {
		userrepo.delete(user);
	}

	@Override
	public Users findByEmail(String email) {
		return userrepo.findByEmail(email);
	}


}
