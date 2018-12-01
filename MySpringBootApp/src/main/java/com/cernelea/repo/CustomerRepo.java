package com.cernelea.repo;

import com.cernelea.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepo extends CrudRepository<Customer, Long> {

    Customer findById(long id);
}
