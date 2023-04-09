package com.example.obrestdatajpa.controller;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    //atributos
    private BookRepository bookRepository;

    //constructor
    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    //getter and setter


    //CRUD sobre la entidad Book

    //Buscar todos los libros

    /****
     * http://localhost:8080/api/books
     * @return
     */
    @GetMapping("/api/books")
    public List<Book> findAll(){
        //recuperar y devolver los libros de base de datos
        return bookRepository.findAll();
    }


    //buscar un solo libreo en case de datos segun su id
    @GetMapping("/api/books/{id}")
    public Book getBookById(@PathVariable Long id){
        Optional<Book> bookOut = bookRepository.findById(id);
        return bookOut.orElse(null);
    }

    //crear un nuevo libro en base de datos

    //actualizar un libro existente en Base de datos

    //borrar un libro en base de datos


}
