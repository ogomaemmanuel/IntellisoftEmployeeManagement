/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intelliSoftKenya.employeeManagement.controller;

import com.intelliSoftKenya.employeeManagement.dto.Employee;
import com.intelliSoftKenya.employeeManagement.services.EmployeeRepository;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Emmanuel
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeRepository employeeRepository;
    
    public EmployeeController(EmployeeRepository employeeRepository) {
    	this.employeeRepository= employeeRepository;
    }
    @RequestMapping(value =  "/save", method = RequestMethod.POST)
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
         employeeRepository.save(employee);        
         return  ResponseEntity.ok().build();    
    }
    
    @RequestMapping(value =  "/delete/{Id}", method = RequestMethod.GET)
    public ResponseEntity<?> deletEmployee(@PathVariable long Id){
         employeeRepository.deleteById(Id);        
         return  ResponseEntity.ok().build();    
    }
    
    @RequestMapping(value =  "/update/{Id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateEmployee(@PathVariable long Id,
            @RequestBody Employee employee){
       return null;    
    }
    
}
