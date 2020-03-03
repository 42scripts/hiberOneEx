package com.example.hiberOneEx;

import com.example.hiberOneEx.domain.Book;
import com.example.hiberOneEx.services.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

/**
 * BookServiceUnitTest.
 *
 * @author Ivan_Kuts
 */

@SpringBootTest
public class BookServiceUnitTest {
    @Autowired
    private BookService bookService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<Book> books = bookService.list();
        Assert.noNullElements(books,"");
    }
}
