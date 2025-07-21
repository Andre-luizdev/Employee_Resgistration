package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will you register? ");
   		int n = sc.nextInt();
   		sc.nextLine();
   		
       for(int i = 0; i < n; i++) {
    	   
    	   		System.out.println("\nEmployee #" + (i + 1));
    	   
    	   		System.out.print("Name of employee: ");
                String name = sc.nextLine();

                System.out.print("Position of employee: ");
                String position = sc.nextLine();

                System.out.print("Salary: R$ ");
                double salary = sc.nextDouble();
                sc.nextLine();
               
                System.out.print("Date of admission (dd/MM/yyyy): ");
                String date = sc.nextLine();

                Employee emp = new Employee(name, position, salary, date, i + 1);
                employees.add(emp);
            }

        System.out.println("\n=== Employees Registered ===");
        for (Employee e : employees) {
            System.out.println(e);
        }

        sc.close();
    }
}
