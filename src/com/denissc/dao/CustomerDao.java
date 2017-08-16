package com.denissc.dao;

import com.denissc.models.Customer;
import com.denissc.models.Project;

import java.io.EOFException;
import java.io.IOException;
import java.util.Set;

public class CustomerDao extends JavaIOModelDAOImpl<Customer> {
    @Override
    String getFileName() {
        return "customers.txt";
    }

    @Override
    Customer readRecord() {
        int id = 0, companyId = 0;
        String name = "";
        Customer company = null;
        try {
            id = readInt();
            companyId = readInt();
            name = readString();
        } catch (EOFException e){
//            End of file
        } catch (IOException e) {
            System.out.println("(INFO) Failed to read Customer.");
        } finally {
            if (id > 0) {
                company = new Customer(id, companyId, name);
            }
        }

        return company;
    }

    @Override
    void writeRecord(Customer customer) {
        int id, companyId;
        String customerName;
        if (customer == null) {
            id = 0;
            companyId = 0;
            customerName = "";
        } else {
            id = customer.getId();
            companyId = customer.getCompanyId();
            customerName = customer.getName();
        }

        if (customerName.length() > STRING_LENGTH ) {
            System.out.printf("(INFO) String characters limit is %s. skipping.\n", STRING_LENGTH);
        } else {
            try {
                writeInt(id);
                writeInt(companyId);
                writeString(customerName);
            } catch (IOException e) {
                System.out.println("(INFO) Failed to write Customer.");
            }
        }

    }

    @Override
    int getModelEntitySize() {
        return 2 * Integer.BYTES + (Character.BYTES * STRING_LENGTH);
    }

    /**
     * Returns related projects to the customer
     * @param customer
     * @param projectModelDao
     * @return set of projects
     */
    public Set<Project> findCustomerProjects(Customer customer, ModelDao<Project> projectModelDao) {
        return projectModelDao.findWhere((Project project) -> project.getCustomerId() == customer.getId());
    }
}
