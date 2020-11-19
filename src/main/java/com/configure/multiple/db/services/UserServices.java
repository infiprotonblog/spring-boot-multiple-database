package com.configure.multiple.db.services;

import com.configure.multiple.db.model.Book;
import com.configure.multiple.db.model.User;
import com.configure.multiple.db.repositories.book.BookRepository;
import com.configure.multiple.db.repositories.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
