package com.hbm;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

		@Id
	int empId;
	int empName;
	
	@OneToOne(mappedBy = "employee")
	
	Address address;
	
	Employee() {
		
	}

	public int getEmpId() {
		return empId;
	}

	

	public int getEmpName() {
		return empName;
	}

	public void setEmpName(int empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
