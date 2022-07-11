// Write a program to insert a number at a given location in an array.
import java.util.Scanner;

public class Array_delection{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter The Size Of Array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n+1];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter index of value to be deleted:");
		int m=sc.nextInt();
		System.out.print("Enter value to be deleted:");
		int p=sc.nextInt();
		for(int i=0;i<a.length;i++){		// 10 20 30 40 50
			if(i<m){						// 10 
				b[i]=a[i];
			}
			else if(i==m){
				continue;
			}
			else{
				b[i-1]=a[i];
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(b[i]+" ");
		}
	}
}