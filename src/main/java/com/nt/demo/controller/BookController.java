package com.nt.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.demo.model.Books;
import com.nt.demo.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/allbooks")
	public List<Books> getAllBooks(){
		return  bookService.getAllBooks();
		
	}
	@GetMapping("/book/{bid}")
	public Books getBooks(@PathVariable("bid")  Integer bid) {
		return	bookService.getBookById(bid);		
	}
	@PostMapping("/book")
	private int saveBook(@RequestBody Books books) {
		 bookService.saveOrUpdate(books);
		return books.getBid();
	}
	
	@DeleteMapping("/book/{bid}")
	private void deletebook(@PathVariable("bid") int bid) {
		bookService.delete(bid);
		
	}
	@PutMapping("/book/{bid}")
	private Books update(@RequestBody Books books) {
		bookService.saveOrUpdate(books);
		
		return books;
		
		
		
		
	}
	
	
	
	
	
	
}
	
	
	
	


		
	
		
	
