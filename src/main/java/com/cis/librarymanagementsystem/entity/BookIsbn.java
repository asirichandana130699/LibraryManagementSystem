package com.cis.librarymanagementsystem.entity;

import com.cis.librarymanagementsystem.dao.Book;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table(name = "book_isbn")
@Entity
@Data
public class BookIsbn {
    @Id
    @Column(name = "isbn")
    private Long isbn;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private LibraryBook libraryBook;
    @OneToMany(mappedBy = "id")
    private List<Checkout> checkoutList;
}
