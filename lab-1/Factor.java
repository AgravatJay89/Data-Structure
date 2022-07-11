import java.util.Scanner;

public class Factor{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Any Number:");
		int n = sc.nextInt();

		for(int i=1;i<n+1;i++){
			if(i<n){
				System.out.println(i + ",");
			}

			else if(i==n){
				System.out.println(i);
			}
		}
	}
}