package entities;

import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Employee {

	public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static final Random random = new Random();
	public static final Set<Integer> idsGerados = new HashSet<>();
	
	
	private String name;
	private String position;
	private double salary;
	private String admissionDate;
	private int id;
	
	public Employee() {
		
	}

	public Employee(String name, String position, double salary, String admissionDate, int id) {
		
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.admissionDate = admissionDate;
		this.id = id;
	}
	
	private int gerarId() {
		int newId;
		do {
			newId = random.nextInt(9000) + 1000;
			} while (idsGerados.contains(newId));
		idsGerados.add(newId);
		return newId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		
		return "ID: " + id + ", name: " + name + ", position: " + position + ", Salary: R$ " + salary + ", Admission: " + admissionDate;
	}
	
}
