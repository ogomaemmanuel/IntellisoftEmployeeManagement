/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intelliSoftKenya.employeeManagement.dto;

import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Emmanuel
 */
public class Employee {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String dateOfBirth;
    private UUID employerId;
    private String address;
    @OneToOne(optional=false,cascade=CascadeType.ALL, 
       mappedBy="employee",targetEntity=EmployeeContractInformation.class)
    private EmployeeContractInformation employeeContractInformation;

    public EmployeeContractInformation getEmployeeContractInformation() {
        return employeeContractInformation;
    }

    public void setEmployeeContractInformation(EmployeeContractInformation 
            employeeContractInformation) {
        this.employeeContractInformation = employeeContractInformation;
    }

    public String getName() {
        return name;
    }

    public UUID getEmployerId() {
        return employerId;
    }

    public void setEmployerId(UUID employerId) {
        this.employerId = employerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
