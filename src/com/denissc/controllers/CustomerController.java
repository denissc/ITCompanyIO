package com.denissc.controllers;

import com.denissc.dao.CustomerDao;
import com.denissc.dao.ProjectDao;
import com.denissc.models.Customer;
import com.denissc.models.Project;

import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public class CustomerController implements ConsoleController<Customer> {
    CustomerDao customerDao = new CustomerDao();
    @Override
    public Set<Customer> findAll() {
        return customerDao.findAll();
    }

    @Override
    public void create(Customer model) {
        customerDao.create(model);
    }

    @Override
    public void update(Customer model) {
        customerDao.update(model);
    }

    @Override
    public Customer findById(int id) {
        return customerDao.findById(id);
    }

    public Set<Project> findCustomerProjects(Customer customer){
        return customerDao.findCustomerProjects(customer, new ProjectDao());
    }

    @Override
    public void delete(Customer model) {
        customerDao.delete(model);
    }
}
