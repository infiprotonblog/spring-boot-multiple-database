package com.configure.multiple.db.services;

import com.configure.multiple.db.model.Book;
import com.configure.multiple.db.repositories.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {
    @Autowired
    BookRepository bookRepository;

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
}
