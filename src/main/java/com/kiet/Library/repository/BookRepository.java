package com.kiet.Library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiet.Library.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByCategoryIgnoreCase(String category);

    List<Book> findByPublicationYearGreaterThanEqual(int year);
}