package com.dhia.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositery extends JpaRepository<Customer, Integer> {

}
