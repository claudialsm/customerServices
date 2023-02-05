package com.check.customer;

import org.springframework.stereotype.Service;

//Service to handle requests
@Service
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build()
                ;
    }
}
