import java.util.Scanner;
public class timeangle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Hours:");
		int hours=sc.nextInt();
		System.out.print("Enter Minutes:");
		int minutes=sc.nextInt();
		double houreangle;
		double minutesangle;

		houreangle=hours*30+(minutes*0.5);
		minutesangle=minutes*6;
		System.out.println(Math.abs(houreangle-minutesangle));
	}
}
