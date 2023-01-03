package com.example.obrestdatajpa;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDatajpaApplication.class, args);

		BookRepository repository =  context.getBean(BookRepository.class);

		//CRUD

		//Crear un libro
		Book book1 = new Book(null, "Homo Deus", "Yuval Noah", 450, 29.99, LocalDate.of(2020,12,1),false);
		Book book2 = new Book(null, "El Señor de los Anillos: La comunidad del anillo", "J.R. Tolkien", 500, 31.99, LocalDate.of(2018,5,23),false);

		repository.save(book1);
		repository.save(book2);

		System.out.println("numero de libros en BD: " + repository.findAll().size());

		//recuperar todos los libros
		System.out.println(repository.findAll());


		//borrar un libro
		repository.deleteById(1L);
		System.out.println("numero de libros en BD: " + repository.findAll().size());

	}

}
