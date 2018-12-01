package com.cernelea.Service;

import com.cernelea.entity.Customer;
import com.cernelea.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public List<Customer> getCustomerList() {
        List<Customer> customerList = new ArrayList<>();

        customerRepo.findAll().forEach(customer -> customerList.add(customer));


        return customerList;
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepo.save(customer);

    }

    @Override
    public void updateCustomer(Customer customer) {

        customerRepo.save(customer);

    }

    @Override
    public Customer getCustomer(long id) {
        return customerRepo.findById(id);


    }

    @Override
    public void deleteCustomer(long id) {
        customerRepo.deleteById(id);

    }

//    @Autowired
//    private CustomerDAOImpl customerDAO;
//
//
//    @Override
//    @Transactional
//    public List<Customer> getCustomerList() {
//        return customerDAO.getList();
//    }
//
//    @Override
//    @Transactional
//    public void saveCustomer(Customer customer) {
//        customerDAO.saveCustomer(customer);
//    }
//
//    @Override
//    @Transactional
//    public void updateCustomer(Customer customer) {
//        customerDAO.updateCustomer(customer);
//
//
//    }
//
//    @Override
//    @Transactional
//    public Customer getCustomer(int id) {
//        return customerDAO.getCustomer(id);
//    }
//
//    @Override
//    @Transactional
//    public void deleteCustomer(int id) {
//
//        customerDAO.deleteCustomer(id);


//    }
}
