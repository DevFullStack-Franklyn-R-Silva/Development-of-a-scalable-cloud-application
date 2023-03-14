package com.github.hadesfranklyn.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hadesfranklyn.project.model.Book;


public interface BookRepository extends JpaRepository<Book, Long>{

}
