/*Create class Employee_Detail with attributes Employee_id, Name, Designation, and Salary. Write a 
program to read the detail from user and print it. */

import java.util.Scanner;

public class Employee_Detail{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int Employee_id;
		String Name;
		String Designation;
		double Salary;

		System.out.println("Enter Employee_id : ");
		 Employee_id=sc.nextInt();

		System.out.println("Enter Name : ");
		  Name= sc.next();

		System.out.println("Enter Designation : ");
		  Designation= sc.next();

		System.out.println("Enter Salary :");
		 Salary=sc.nextDouble();

		System.out.println("*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  ");
		
		System.out.println("Employee_id: "+ Employee_id);
		System.out.println("Name: "+Name);
		System.out.println("Designation: "+Designation);
		System.out.println("Salary: "+Salary);

	}
}