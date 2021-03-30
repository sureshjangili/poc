package com.nt.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.demo.model.Books;
import com.nt.demo.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	public List<Books> getAllBooks() {
		List<Books> books=new ArrayList<Books>();
		 bookRepository.findAll().forEach(books1->books.add(books1));
		return books;
		 
	}

	public Books getBookById(Integer bid) {
	return	bookRepository.findById(bid).get();
	}

	public void saveOrUpdate(Books books) {
		bookRepository.save(books);
	}

	public void delete(int bid) {
		bookRepository.deleteById(bid);
	}





	
	



		
	}


