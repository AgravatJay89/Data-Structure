/*Read n numbers in an array then read two different numbers, replace 1st number with 2nd number 
in an array and print its index and final array.*/
import java.util.Scanner;

public class ArrayDemo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Size of Array");

		int n=sc.nextInt();

		int a[]=new int[n];
		System.out.println("Enter the Element of Array:");

		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}

		
		System.out.println("Enter Number The Find In Array");
		int x=sc.nextInt();

		System.out.println("Enter number to replace with");
		int y=sc.nextInt();

		for(int i=0;i<a.length;i++){
			if(x==a[i])
				a[i]=y;
		}
		System.out.println("updated Array is");

			for(int i=0;i<a.length;i++){
				System.out.println(a[i]+" ");
			}
	}
}