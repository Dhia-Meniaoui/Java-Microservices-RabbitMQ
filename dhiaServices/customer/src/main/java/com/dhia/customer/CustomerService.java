package com.dhia.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest){
         Customer.builder().firstName(customerRegistrationRequest.name())
                .lastName(customerRegistrationRequest.lastname())
                .email(customerRegistrationRequest.email())
                .build();
    }

    //check the email
    //check the email is not token
    //store customer in the database
}
