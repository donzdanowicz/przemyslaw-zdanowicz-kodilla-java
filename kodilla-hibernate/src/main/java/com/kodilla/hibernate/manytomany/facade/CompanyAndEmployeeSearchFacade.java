package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyAndEmployeeSearchFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> retrieveEmployeeByAnyLetters(String letters) {
         return employeeDao.retrieveEmployeeByAnyLetters(letters);
    }

    public List<Company> retrieveCompaniesWithLettersAsGiven(String name) {
            return companyDao.retrieveCompaniesWithLettersAsGiven(name);
    }

}
