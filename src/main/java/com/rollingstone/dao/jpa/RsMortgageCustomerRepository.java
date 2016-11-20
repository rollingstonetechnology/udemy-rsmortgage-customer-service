package com.rollingstone.dao.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.rollingstone.domain.Customer;
import com.rollingstone.domain.User;



public interface RsMortgageCustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    User findCustomerByRating(int rating);
    Page findAll(Pageable pageable);
}
