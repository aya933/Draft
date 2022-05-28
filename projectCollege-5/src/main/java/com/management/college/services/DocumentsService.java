package com.management.college.services;



import com.management.college.entity.Documents;

import java.util.List;
import java.util.Optional;


public interface DocumentsService {
	 Optional<Documents> findOne(Long id);
	List<Documents> findall();
	void save(Documents documents);
	void delete(Long id);
	void delete(Documents documents);
	public Documents getFile(Long id);
	public Documents getFilename(String name);
	List<Documents> savedoc(List<Documents> documents);



}
