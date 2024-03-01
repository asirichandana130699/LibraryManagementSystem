package com.cis.librarymanagementsystem.repository;

import com.cis.librarymanagementsystem .entity.LibraryMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<LibraryMember,  Integer> {
}
