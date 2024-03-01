package com.cis.librarymanagementsystem.dao;

import com.cis.librarymanagementsystem.entity.Address;
import com.cis.librarymanagementsystem.entity.Checkout;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Data
@Getter
@Setter
public class Member {
    private int memberId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String phoneNumber;
    private String membershipLevel;
    private Address address;
    private List<Checkout> checkoutList;
}
