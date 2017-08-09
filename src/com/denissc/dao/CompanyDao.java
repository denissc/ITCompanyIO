package com.denissc.dao;

import com.denissc.models.Company;
import com.denissc.models.Customer;
import com.denissc.models.Model;

import java.io.EOFException;
import java.io.IOException;
import java.util.Set;

public class CompanyDao extends JavaIOModelDAOImpl<Company> {

    @Override
    String getFileName() {
        return "companies.txt";
    }

    @Override
    Company readRecord() {
        int id = 0;
        String name = "";
        Company company = null;
        try {
            id = readInt();
            name = readString();
        } catch (EOFException e){
//            End of file
        } catch (IOException e) {
            System.out.println("(INFO) Failed to read Company.");
        } finally {
            if (id > 0) {
                company = new Company(id, name);
            }
        }

        return company;
    }

    @Override
    void writeRecord(Company company) {
        int companyId;
        String companyName;
        if (company == null) {
            companyId = 0;
            companyName = "";
        } else {
            companyId = company.getId();
            companyName = company.getName();
        }

        if (companyName.length() > STRING_LENGTH ) {
            System.out.printf("(INFO) String characters limit is %s. skipping.\n", STRING_LENGTH);
        } else {
            try {
                writeInt(companyId);
                writeString(companyName);
            } catch (IOException e) {
                System.out.println("(INFO) Failed to write Company.");
            }
        }

    }

    @Override
    int getModelEntitySize() {
        return Integer.BYTES + (Character.BYTES * STRING_LENGTH);
    }

    public Set<Customer> findCompanyCustomers(Company company, ModelDao<Customer> customerModelDao ) {
        return customerModelDao.findWhere((Customer customer) -> customer.getCompanyId() == company.getId());
    }
}
