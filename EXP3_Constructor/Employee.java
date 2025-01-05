import java.util.*;
public class Employee {
	String FirstName;
	String LastName;
	double Salary;
	Employee(){
		FirstName = null;
		LastName = null;
		Salary = 0.0;
	}
	void SetFirst() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter First Name:");
		FirstName = sc.nextLine();
		//LastName = sc.nextLine();
	}
	void SetLast() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Last Name:");
		//FirstName = sc.nextLine();
		LastName = sc.nextLine();
	}
	void SetSalary() {
		Scanner sc =new Scanner(System.in);
		Salary = sc.nextDouble();
	}
	String GetFirst() {
		return FirstName;
	}
	String GetLast() {
		return LastName;
	}
	double GetSalary() {
		return Salary;
	}
	void Display(double SalaryYear,double SalaryRised,double RisedSalaryNextYear) {
		System.out.println(FirstName.concat(" ").concat(LastName));
		System.out.println("Salary Per Month:"+Salary);
		System.out.println("Salary per Year:"+SalaryYear);
		System.out.println("Rised Salary in Next Year:"+SalaryRised);
		System.out.println("Total Salary Rised next Year:"+RisedSalaryNextYear);
	}
	double CalculateSalary() {
		double SalaryYear = (Salary * 12);
		return SalaryYear;
	}
	Double RiseSalary() {
		double RisedSalary = ((Salary *10)/100)+Salary;
		Salary = RisedSalary;
		return RisedSalary;
	}
	public static void main(String []args) {
		Employee a = new Employee();
		Employee b = new Employee();
		double SalaryYear = 0.0;
		double SalaryRise = 0.0;
		double RisedSalaryNextYear = 0.0;
		a.SetFirst();
		a.SetLast();
		a.SetSalary();
		System.out.println("Enter data for Second Employee");
		b.SetFirst();
		b.SetLast();
		b.SetSalary();
		//System.out.println("Yearly Salary for first Employee:");
		SalaryYear = a.CalculateSalary();
		SalaryRise = a.RiseSalary();
		RisedSalaryNextYear = a.CalculateSalary();
		a.Display(SalaryYear, SalaryRise,RisedSalaryNextYear);
		SalaryYear = b.CalculateSalary();
		//System.out.println(SalaryYear);
		//System.out.println("Yearly Rise in Salary for second Employee:");
		SalaryRise = b.RiseSalary();
		//System.out.println(SalaryYear);
		RisedSalaryNextYear = b.CalculateSalary();
		b.Display(SalaryYear, SalaryRise,RisedSalaryNextYear);
		
		
		
	}
}
