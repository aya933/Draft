package com.management.college.service.implement;
import com.management.college.entity.Documents;
import com.management.college.repository.DocumentsRepo;
import com.management.college.services.DocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DocumentsServiceImp implements DocumentsService {
     @Autowired
	 DocumentsRepo documentsrepo;

	public Optional<Documents> findOne(Long id) {
		return documentsrepo.findById(id);	}


	public List<Documents> findall() {
		return documentsrepo.findAll();
	}


	public void save(Documents documents) {
		documentsrepo.save(documents);
		
	}


	public void delete(Long id) {
		 documentsrepo.deleteById(id);
		
	}


	public void delete(Documents documents) {
		documentsrepo.delete(documents);
	}


	public Documents getFile(Long id) {
		return documentsrepo.findById(id).get();
	}


	public Documents getFilename(String name) {
	        return      documentsrepo.findByName(name)	;

	}


	public List<Documents> savedoc(List<Documents> documents) {
		return documentsrepo.saveAll(documents);
	}


}
