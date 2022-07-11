//Write a program to swap two numbers using user-defines method.
import java.util.*;

public class Swap_Two_Number{
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before swapping a:-"+a);
		System.out.println("Before swapping b:-"+b);
		Swap_Two_Number s = new Swap_Two_Number();
		s.swap_demo(a,b);
	}

	public int swap_demo(int a,int b)
	{
		
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping a:-"+a);
		System.out.println("After swapping b:-"+b);
		return 0;
	}
}	