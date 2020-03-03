package com.example.hiberOneEx.services;

import com.example.hiberOneEx.domain.Book;
import com.example.hiberOneEx.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * BookService.
 *
 * @author Ivan_Kuts
 */

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        return bookRepository.findAll();
    }
}
