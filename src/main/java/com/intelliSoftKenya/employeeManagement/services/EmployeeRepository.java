/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intelliSoftKenya.employeeManagement.services;

import com.intelliSoftKenya.employeeManagement.dto.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Emmanuel
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>,
        CustomEmployeeRepositoryInterface{
    
   @Query("select from Employee left join EmployeeContractInformations")
    public List<Employee> findUserWithExpiredContracts();
}
