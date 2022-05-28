package com.management.college.repository;

import com.management.college.entity.Documents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentsRepo extends JpaRepository<Documents,Long> {
  public Documents findByName(String name);

}
