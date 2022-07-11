public class demo{
	public static void main(String[] args) {
		// DS ds1=new DS();
		// DS ds2=new DS();
		// DS ds3=new DS();
		// DS ds4=new DS();

		// DS ds1=new DS(0);
		// DS ds2=new DS(10);
		// DS ds3=new DS(15);
		// DS ds4=new DS(30);

		DS ds1=new DS(0);
		DS ds2=new DS(10 , ds1);
		DS ds3=new DS(15 , ds2);
		DS ds4=new DS(30 , ds3);
		ds1.print();
		ds2.print();
		ds3.print();
		ds4.print();
	}
}

class DS{
	int a;
	DS prv;

	public DS(){
		this.a=0;
		this.prv=null;
	}
	public DS(int a){
		this.a=a;
		this.prv=null;
	}
	public DS(int a, DS prv){
		this.a=a;
		this.prv=prv;
	}
	public void print(){
		if(prv!=null){
		System.out.println(a +","+prv.a);
		}
	}

}