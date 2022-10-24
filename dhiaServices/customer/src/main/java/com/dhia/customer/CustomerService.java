package com.dhia.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepositery customerRepositery) {
    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest){
        Customer customer = Customer.builder().firstname(customerRegistrationRequest.firstname())
                .lastname(customerRegistrationRequest.lastname())
                .email(customerRegistrationRequest.email())
                .build();

        //check the email
        //check the email is not token
        //store customer in the database
        System.out.print(customer);
        customerRepositery.save(customer);
    }
}
