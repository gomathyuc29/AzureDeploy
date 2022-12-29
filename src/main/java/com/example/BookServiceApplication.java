package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class BookServiceApplication {
	
	@GetMapping("/findAllBooks")
	@CrossOrigin("http://localhost:4200")
	public List<Book> getBooks()
	{
		ArrayList<Book> resp=new ArrayList<Book>();
		resp.add(new Book(100, "JAVA", 999));
		resp.add(new Book(101, "PYTHON", 777));
		resp.add(new Book(102, ".net", 888));
		return resp;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

}
