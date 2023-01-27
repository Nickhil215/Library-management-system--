package com.driver.services;

import com.driver.models.Author;
import com.driver.models.Book;
import com.driver.repositories.AuthorRepository;
import com.driver.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {


    @Autowired
    BookRepository bookRepository2;
    @Autowired
    AuthorRepository authorRepository;

    public void createBook(Book book){
        if(book != null && book.getAuthor() != null) { //Checking if the book and its author are not null
            Author author = book.getAuthor();
//Checking if the author already has a list of books, if not, creating a new list
            if(author.getBooksWritten() == null) {
                author.setBooksWritten(new ArrayList<>());
            }
            author.getBooksWritten().add(book);
            book.setAuthor(author);
            book.setAvailable(true);
            authorRepository.save(author);
        }
    }

    public List<Book> getBooks(String genre, boolean available, String author){
        List<Book> books = null; //find the elements of the list by yourself
        if(genre!=null && author!=null && available){
            books=bookRepository2.findBooksByGenreAuthor(genre,author,available);
        } else if (author!=null && genre==null && available) {
            books=bookRepository2.findBooksByAuthor(author,available);
        } else if (genre!=null && author==null && available) {
            books=bookRepository2.findBooksByGenre(genre,available);
        } else if (genre==null && author==null && available) {
            books=bookRepository2.findByAvailability(available);
        }else {
            books=bookRepository2.findAll();
        }
        return books;
    }
}
