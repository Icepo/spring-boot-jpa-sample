package com.xx.fun.dao;

import com.xx.fun.entity.Customer;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * Created by Alex on 2016/10/26.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByName(String name);

    @Query("select a from Customer a where a.ctime<:ctime")
    List<Customer> findByCtime(@Param("ctime") long ctime);
}
