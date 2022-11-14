package coursrworktwo;

import java.util.ArrayList;
import java.util.List;

public class Start {

	
	
	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		Employee em = new Manager("bob ross", 1000.22);
		Employee db1 = new DatabaseAdministrator("Database Administrator 1", 2000, true);
		DatabaseAdministrator db2 = new DatabaseAdministrator("Database Administrator 2", 3000, true);
		DatabaseAdministrator db3 = new DatabaseAdministrator("Database Administrator 3", 5300, true);
		
		
		emp.add(em);
		emp.add(db1);
		emp.add(db2);
		emp.add(db3);
		
		for(Employee i : emp) {
			
			System.out.println("Pay: " + i.calculateTotalPay());

		}
		
		
	}
	
	

}
