package com.denissc.controllers;

import com.denissc.dao.CompanyDao;
import com.denissc.models.Company;
import com.denissc.models.Model;

import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public class CompanyController implements ConsoleController{
    CompanyDao companyDao = new CompanyDao();

    @Override
    public Set<Model> findAll() {
        return companyDao.findAll();
    }

    @Override
    public void create(Model model) {
        companyDao.create(model);
    }

    @Override
    public void update(Model model) {
        companyDao.update(model);
    }

    @Override
    public Model findById(int id) {
        return companyDao.findById(id);
    }

    @Override
    public void delete(Model model) {
        companyDao.delete(model);
    }
}
