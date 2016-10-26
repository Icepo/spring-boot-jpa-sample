package com.xx.fun;

import com.xx.fun.dao.CustomerRepository;
import com.xx.fun.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 *
 * Created by Alex on 2016/10/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MainTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testExample() throws Exception {
        this.entityManager.persist(new Customer("xxxx", System.currentTimeMillis()));
        Customer customer = this.customerRepository.findOne(1L);
        assertThat(customer.getName(), equalTo("xxxx"));
    }

}
