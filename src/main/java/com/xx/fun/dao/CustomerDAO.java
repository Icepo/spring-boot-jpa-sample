package com.xx.fun.dao;

import com.xx.fun.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * Created by Alex on 2016/11/8.
 */
@Repository
public class CustomerDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Customer customer){
        String sql = "insert into customer(name, ctime) values(?,?)";
        jdbcTemplate.update(sql, customer.getName(),customer.getCtime());
    }

    public Customer queryById(long id){
        String sql = "select id, name, ctime from customer where id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, Customer.class);
    }

    public List<Customer> queryAll(){
        String sql = "select id, name, ctime from customer";
        return jdbcTemplate.queryForList(sql, Customer.class);
    }

}
