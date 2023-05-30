package com.ait.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ait.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
