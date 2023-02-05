package com.check.customer;

//immutability to strings
public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {

}
