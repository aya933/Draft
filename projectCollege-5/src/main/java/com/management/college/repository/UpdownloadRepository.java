package com.management.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.college.entity.Documents;

public interface UpdownloadRepository extends JpaRepository<Documents, Long>{

}
