package com.xx.fun.service;

import com.xx.fun.dao.CustomerRepository;
import com.xx.fun.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * Created by Alex on 2016/10/26.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    @Transactional
    public void delete(long id){
        customerRepository.delete(id);
    }
}
