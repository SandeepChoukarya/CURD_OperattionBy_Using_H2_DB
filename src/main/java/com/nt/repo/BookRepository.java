package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> { 
	

}
