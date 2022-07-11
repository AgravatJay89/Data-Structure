import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args) {
		int flag=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any number:");
		int n = sc.nextInt();

		for(int i=2;i<n;i++){
			if(n%i==0)
			{
				flag++;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Entered number is prime");
		}

		else if(flag!=0)
		{
			System.out.println("Entered number is not prime");
		}
	}
}

