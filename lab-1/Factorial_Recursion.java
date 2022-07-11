import java.util.*;
	public class Factorial_Recursion{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter Number: ");

			int n =sc.nextInt();

			Recursion re = new Recursion();

			System.out.println("factorial is:" +re.fact(n));
		}
	}

	class Recursion{
		int fact(int n){
			if(n==1)
			{
				return 1;
			}

			else
			{
				return(fact(n-1)*n);
			}
		}
	}