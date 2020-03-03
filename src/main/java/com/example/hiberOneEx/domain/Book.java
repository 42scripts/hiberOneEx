package com.example.hiberOneEx.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Book.
 *
 * @author Ivan_Kuts
 */
@Entity(name="BOOK")
@Data
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    // standard constructors

    // standard getters and setters
}