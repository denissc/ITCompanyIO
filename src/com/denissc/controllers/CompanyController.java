package com.denissc.controllers;

import com.denissc.dao.CompanyDao;
import com.denissc.dao.CustomerDao;
import com.denissc.models.Company;
import com.denissc.models.Customer;

import java.util.Set;

public class CompanyController implements ConsoleController<Company> {

    CompanyDao companyDao = new CompanyDao();

    @Override
    public Set<Company> findAll() {
        return companyDao.findAll();
    }

    @Override
    public void create(Company model) {
        companyDao.create(model);
    }

    @Override
    public void update(Company model) {
        companyDao.update(model);
    }

    @Override
    public Company findById(int id) {
        return companyDao.findById(id);
    }

    public Set<Customer> findCompanyCustomers(Company company) {
        return companyDao.findCompanyCustomers(company, new CustomerDao());
    }

    @Override
    public void delete(Company model) {
        companyDao.delete(model);
    }
}
