package coursrworktwo;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
	
	List<Employee> i = new ArrayList<>();
	
	public Manager(String name, double pay) {
		super(name, pay);
	}
	
	
	public double calculateTotalPay() {
		double tmp = 0;
		for(Employee emp : i) {
			tmp = emp.calculateTotalPay();
		}
		return tmp;
	}
	
	
}
