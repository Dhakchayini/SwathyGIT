package org.Encapsulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeDetails {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.seteId(101);
		emp1.setEmpName("Mithun");
		emp1.setEmpAddress("Chennai");
		emp1.setDob("15/12/2002");

		Employee emp2 = new Employee();
		emp2.seteId(102);
		emp2.setEmpName("Mahati");
		emp2.setEmpAddress("Madurai");
		emp2.setDob("20/06/2016");

		// UserDefined list
		System.out.println("Using list");
		List<Employee> list = new ArrayList<Employee>();

		list.add(emp1);
		list.add(emp2);

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).geteId());
			System.out.println(list.get(i).getEmpName());
			System.out.println(list.get(i).getEmpAddress());
			System.out.println(list.get(i).getDob());

		}

		//UseDefined Set
		System.out.println("\n"+"Using set");
		HashSet<Employee> set = new HashSet<Employee>();
		set.add(emp1);
		set.add(emp2);
		
		for (Employee employee : set) {
		
			System.out.println(employee.geteId());
			System.out.println(employee.getEmpName());
			System.out.println(employee.getEmpAddress());
			System.out.println(employee.getDob());
		}
		
		//UserDefined Map
		System.out.println("\n"+"Using HashMap");
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(null, null);
		map.put(emp2, 2);
		
		for (Employee employeemap : map.keySet()) {
			
			
			
		}
		
		
		
		
		
	}
	

}
