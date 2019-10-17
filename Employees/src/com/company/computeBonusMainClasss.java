package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class computeBonusMainClasss {

	public static void main(String[] args) {
		Address address = new Address("Hinjewadi", "pune", "Maharashtra", 411057, "INDIA");
		Employees employee = new Contractor(101, "Shubham", "Contractor", address, 226010, 5000.0);
		Employees employee1 = new Regular(102, "Jatinder", "Regular", address, 226011, 5000.0);
		if (employee instanceof Contractor) {
			((Contractor) employee).setSalary(((Contractor) employee).computeBonus());
			//System.out.println(((Contractor) employee).getSalary());

		}

		if (employee1 instanceof Regular) {
			((Regular) employee1).setSalary(((Regular) employee1).computeBonus());
			//System.out.println(((Regular) employee1).getSalary());

		}
		//Map<Integer,Employees> map1=new HashMap<Integer,Employees>();
		Map<Integer,Employees> map=new LinkedHashMap<Integer,Employees>();
		map.put(226010, employee);
		map.put(226011, employee1);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter phone number to retrieve details of Employee");
		int phone=sc.nextInt();
//		if(map.containsKey(phone))
//		{
//			System.out.println(map.get(phone));
//		}
//		else
//			System.out.println("phone number do not exists");
//		Set<Map.Entry<Integer, Employees>> yo=map.entrySet();
//		for(Entry<Integer, Employees> i:yo){
//			System.out.println(i);
//		}
//		//Set<Integer> set=map.keySet();
//		
//		for(int i:map.keySet()){Employees empp=(map.get(phone));}
	if(map.containsKey(phone)){
			Employees empp=(map.get(phone));
			System.out.println("Employee Details : ");
			System.out.println(empp.getEmployeeId());
			System.out.println(empp.getEmployeeName());
			System.out.println(empp.getEmployeeDesignation());
			System.out.println(empp.getEmployeePhoneNumber());
			System.out.println("Addess : ");
			System.out.println(empp.getAddress().getLocality());
			System.out.println(empp.getAddress().getCity());
			System.out.println(empp.getAddress().getPinCode());
			System.out.println(empp.getAddress().getState());
			System.out.println(empp.getAddress().getCountry());
			
		}else
		System.out.println("phone number do not exists");
	}
	}

