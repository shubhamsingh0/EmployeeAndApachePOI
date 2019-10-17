package com.company;

public class Contractor extends Employees implements ComputeBonusSalary{
	private double salary = 0.0;

	public Contractor(int employeeId, String employeeName, String employeeDesignation, Address address,
			int employeePhoneNumber,double salary) {
		super(employeeId, employeeName, employeeDesignation, address, employeePhoneNumber);
		this.salary=salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0)
			this.salary = salary;
		else
			this.salary = 0;
	}

	@Override
	public double computeBonus() {
		return salary+5000.0;
	}
}
