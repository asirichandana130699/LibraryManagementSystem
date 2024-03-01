package com.cis.librarymanagementsystem.repository;

import com.cis.librarymanagementsystem.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, Integer> {
}
