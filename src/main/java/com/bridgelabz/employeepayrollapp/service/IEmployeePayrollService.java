package com.bridgelabz.employeepayrollapp.service;

import java.util.List;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {
	List<EmployeePayrollData> getEmployeePayrollData();
    EmployeePayrollData getEmployeePayrollDataById(int empId);
	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);
	EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);
    void deleteEmployeePayrollData(int empId);
	/**
	 * Call update method 
	 * @return :  updated Employee details
	 */



}
