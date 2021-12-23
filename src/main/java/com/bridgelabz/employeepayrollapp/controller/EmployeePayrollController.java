package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

	@RequestMapping(value = {"/get"})
	public ResponseEntity<String> getEmployeePayrollData(){
		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}
	
	/**
	 * Using Get method to get the employee by id
	 * @param empId : Employee Id
	 * @return : It will return the employee id
	 */
	@GetMapping("/get/{empId}")
	public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Get Call Success for Id: "+ empId, HttpStatus.OK);
	}
	
	/**
	 * Using post method to add the details
	 * @param empPayrollDTO : Employee id, name and salary
	 * @return : will return id, name and salary
	 */
	@PostMapping("/create")
	public ResponseEntity<String> getEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO){
		return new ResponseEntity<String>("Created Employee Payroll Data for: "+ empPayrollDTO, HttpStatus.OK);
	}
	
	/**
	 * Using put method to update the details
	 * @param empPayrollDTO : Employee id, name and salary 
	 * @return : employee name and salary
	 */
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO){
		return new ResponseEntity<String>("Updated Employee Payroll Data for: "+ empPayrollDTO, HttpStatus.OK);
	}
	
	/**
	 * Using delete method to delete the employee details
	 * @param empId : Employee id
	 * @return : will return string 
	 */
	@DeleteMapping("/remove/{empId}")
	public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Delete call success for id: "+ empId, HttpStatus.OK);
	}
}