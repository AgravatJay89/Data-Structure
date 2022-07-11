import java.util.Scanner;

public class Array_insertion{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter The Size Of Array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n+1];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter index of new value to be inserted:");
		int m=sc.nextInt();
		System.out.print("Enter new value:");
		int p=sc.nextInt();
		for(int i=0;i<n+1;i++){		// 10 20 30 40 50
			if(i<m){				// 10 20 
				b[i]=a[i];
			}
			else if(i==m){
				b[i]=p;
			}
			else{
				b[i]=a[i-1];
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(b[i]+" ");
		}
	}
}