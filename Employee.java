package coursrworktwo;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	
	private String name;
	private double pay;
	private int JSWE = 1;
	private double MSWE = 1.5;
	private double jsweBonus = 3000.00;
	private double swe = 10000.00;
	private double SSWE = 25000;
	private int MSSWE = 2;
	
	List<Employee> employee = new ArrayList<>();
	
	public Employee(String name, double pay) {
		this.name = name;
		this.pay = pay;
	}

	
	public double calculateTotalPay() {
		  
		if(name == "Junior SWE") {
			return (jsweBonus + (pay * JSWE));
		}
		else if(name == "SWE") {
			return (swe + (pay * MSWE));
		}
		else if(name == "Senior SWE") {
			return (SSWE + (pay * MSSWE));
		}
		else if(name == "Database Administrator") {
			return (pay + 800);
		}
		return pay;
	}

	
	public void add(Employee e) {
		employee.add(e);
	}
	
	public void remove(Employee e) {
		employee.remove(e);
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPay() {
		return pay;
	}


	public void setPay(double pay) {
		this.pay = pay;
	}

	
}
