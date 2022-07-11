class Student{
	long 	Enrollment_no;
	String 	Name;
	int 	sem;
	double 	cpi;

	Student(long Enrollment_no,String Name,int sem,double cpi){
		this.Enrollment_no = Enrollment_no;
		this.Name = Name;
		this.sem = sem;
		this.cpi = cpi;
	}

	public void displaydata(){
		System.out.println("Enrollment_no is = "+Enrollment_no);
		System.out.println("Name is = "+Name);
		System.out.println("sem is = "+sem);
		System.out.println("cpi is = "+cpi);
		System.out.println("*  *  *  *  *  *  *  *");
	}

}

public class Student_Detail{
	public static void main(String[] args) {
		Student obj[] = new Student[5];
		obj[0]=new Student(21010,"Jay",	3,8.7);
		obj[1]=new Student(21011,"Harsh",4,6.9);
		obj[2]=new Student(21012,"Rohan",5,8.8);
		obj[3]=new Student(21013,"Ajay",	6,8.0);
		obj[4]=new Student(21014,"Tirth",7,9.2);

		for(int i=0;i<5;i++){
			obj[i].displaydata();
		}
	}
}