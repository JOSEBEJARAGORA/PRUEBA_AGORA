package com.agora.pe.service;

import java.util.List;

import com.agora.pe.entity.Customer;
import com.agora.pe.entity.Statistic;
import com.agora.pe.exceptions.CustomerException;

public interface CustomerService {

    void createCustomer(Customer customer) throws CustomerException;

    Statistic getStatistic() throws CustomerException;

    List<Customer> getCustomers() throws CustomerException;

}
