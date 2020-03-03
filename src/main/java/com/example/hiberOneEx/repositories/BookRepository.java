package com.example.hiberOneEx.repositories;

import com.example.hiberOneEx.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BookRepository.
 *
 * @author Ivan_Kuts
 */

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
