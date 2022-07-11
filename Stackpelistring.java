import java.util.Stack;
import java.util.Scanner;
public class Stackpelistring{
	public static void main(String[] args) {
		Stack stack=new Stack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String To Cheak Pelindrom Or Not:");
		String str=sc.nextLine();

		for(int i=0;i<str.length();i++){
			stack.push(str.charAt(i));
		}
		String revstr="";
		while(!stack.isEmpty()){
			revstr=revstr+stack.pop();
		}
		if(str.equals(revstr)){
			System.out.println("The input String is Pelindrom");
		}
		else{
			System.out.println("The input String is Not Pelindrom");
		}
		
	}
}
