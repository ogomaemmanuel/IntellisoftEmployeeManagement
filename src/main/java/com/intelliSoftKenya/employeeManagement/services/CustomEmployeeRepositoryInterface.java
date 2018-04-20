/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intelliSoftKenya.employeeManagement.services;

import com.intelliSoftKenya.employeeManagement.dto.Employee;

/**
 *
 * @author Emmanuel
 */
public interface CustomEmployeeRepositoryInterface {
    
    public void updateEmployeeContactDatails(Employee e,Long key);
    
}
