package com.management.college.repository;

import com.management.college.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;




public interface UsersRepo extends JpaRepository<Users,Long> {
    Users findByEmail(String email);
}
