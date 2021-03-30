package com.nt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.demo.model.Books;

public interface BookRepository extends JpaRepository<Books, Integer> {

	
	
	

}
