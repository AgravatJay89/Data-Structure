import java.util.Scanner;
public class Array_cheak{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of Array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter cheak Element:");
		int x=sc.nextInt();

		cheakrecursion cr=new cheakrecursion();
		System.out.println(cr.cheak(a,x));
	}
}
class cheakrecursion{
	public int cheak(int a[],int x){
		if(a.length<=0){
			return 0;
		}
		if(a[0]==x){
			return 1;
		}
		else{
			int a2[]=new int[a.length-1];
			for(int j=0,i=0;j<a2.length;j++,i++){
				a2[j]=a[i];
			}
			return cheak(a2,x);
		}
	}
}