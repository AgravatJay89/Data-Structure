 import java.util.Scanner;
 public class secondlast{
 	public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
 		System.out.print("Enter Array Size:");
 		int n=sc.nextInt();
 		int a[]=new int[n];

 		int max=0,max1=0;
 		for(int i=0;i<a.length;i++){
 			a[i]=sc.nextInt();
 			if(max<=a[i]){
 				max1=max;
 				max=a[i];
 			}
 		}
 		System.out.println("Second Largest Number Is:"+max1);
 	}
 }