package com.learn.controller;

import com.learn.dto.OrderResponse;
import com.learn.entity.Customer;
import com.learn.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/rest")
public class ApplicationController {

    @Autowired
    private ApplicationService service;

    @PostMapping(value = "/addCustomer")
    public Customer addCustomerAndProducts(@RequestBody Customer customer) {
        return service.addCustomer(customer);
    }

    @PostMapping("/getRes")
    public List<OrderResponse> getRes() {
        return service.getRes();
    }
}
