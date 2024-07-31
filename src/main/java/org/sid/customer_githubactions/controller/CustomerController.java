package org.sid.customer_githubactions.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "customers", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {

    @GetMapping
    public List<Customer> search() {
        return List.of(new Customer(1, "hicham", "hicham@example.com"),
                new Customer(2, "rachid", "rachid@example.com")
                );
    }
}
