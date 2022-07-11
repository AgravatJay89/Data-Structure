import java.util.*;

public class Factorial{
	public static void main(String[] args) {
		int sum=1;

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= sc.nextInt();

		for(int i=1;i<=n;i++){
			sum=sum*i;
		}

		System.out.println(sum);
	}
}