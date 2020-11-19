package com.configure.multiple.db.controllers;

import com.configure.multiple.db.model.Book;
import com.configure.multiple.db.model.User;
import com.configure.multiple.db.services.BookServices;
import com.configure.multiple.db.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppControllers {

    @Autowired
    UserServices userServices;

    @Autowired
    BookServices bookServices;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userServices.createUser(user);
    }
    @GetMapping("/users")
    public List<User> getUserList(){
        return userServices.getUsers();
    }
    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        return bookServices.createBook(book);
    }
    @GetMapping("/books")
    public List<Book> getBookList(){
        return bookServices.getBooks();
    }

}
