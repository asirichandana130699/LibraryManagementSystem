package com.cis.librarymanagementsystem.repository;

import com.cis.librarymanagementsystem.entity.BookIsbn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookIsbnRepository extends JpaRepository<BookIsbn, Integer> {
}
