package com.cis.librarymanagementsystem.repository;

import com.cis.librarymanagementsystem.entity.LibraryBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<LibraryBook, Integer> {
}
