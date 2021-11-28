package com.learn.service;

import com.learn.dto.OrderResponse;
import com.learn.entity.Customer;
import com.learn.repository.CustomerRepository;
import com.learn.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("applicationService")
public class ApplicationService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<OrderResponse> getRes() {
        return customerRepository.getJoinInformation();
    }
}
