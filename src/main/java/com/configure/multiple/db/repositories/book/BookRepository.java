package com.configure.multiple.db.repositories.book;

import com.configure.multiple.db.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
