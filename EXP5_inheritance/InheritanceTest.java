import java.util.*;
import java.time.*;  
public class InheritanceTest {
	public static void main(String args[]) {
		Student s = new Student();
		s.displayStudent();
		Employe e = new Employe();
		e.displayEmployee();
	}
}
 class Person {
	String Name;
	int Y;
	int D;
	int M;
	float Hight,weight;
	String address;
	Person(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Name:");
		Name = sc.nextLine();
		System.out.println("Enter Birth Year:");
		Y = sc.nextInt();
		System.out.println("Enter Date:");
		D = sc.nextInt();
		System.out.println("Enter Month:");
		M = sc.nextInt();
	}
    void calculateAge() {
    	LocalDate dob = LocalDate.of(Y, M, D );  
    	LocalDate curDate = LocalDate.now();  
    	Period period = Period.between(dob, curDate);  
    	System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());
    	
    }
}
class Student extends Person{
	int rollNo;
	int mrk[]=new int[5];
	int sum=0;
	Student(){
		super();
		System.out.println("Enter Student Details:\n");
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Roll Number:");
		rollNo = sc.nextInt();
		System.out.println("Enter 5 Subject Marks:");
		for(int i =0;i<5;i++) {
			mrk[i] = sc.nextInt();
			sum = sum + mrk[i];
		}
	}
	float calculateAvg() {
		return (sum/5);
	}
	void displayStudent() {
		//calculateAge();
		float Avg = calculateAvg();
		System.out.println("Student Name:"+Name+"\nAge:");
		calculateAge();
		System.out.print("\nRoll Number:"+rollNo+"\nAvrage Marks:"+Avg);
	}
}
class Employe extends Person{
	int empId;
	float salary;
	Employe(){
		super();
		System.out.println("Enter Employee Details:\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		empId = sc.nextInt();
		System.out.println("Enter Salary:");
		salary = sc.nextFloat();
	}
	float calculateTax() {
		return ((salary *18)/100); 
	}
	void displayEmployee() {
		float Tax = calculateTax();
		System.out.println("Student Name:"+Name+"\nAge:");
		calculateAge();
		System.out.print("\nEmployee ID:"+empId+"\nTotal Salary:"+salary+"\nTotal Tax on Salary:"+Tax);
	}
}
