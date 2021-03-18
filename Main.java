import java.util.*;

public class Main {
	
	public static void main(String[] args){
		empDriver();
		moleculeDriver();
		//CacheCount
		cacheCountDriver();
	}
	
	public static void cacheCountDriver(){
		Scanner s1 = new Scanner(System.in);
		System.out
				.println("Please enter all the String with new line or space");
		System.out.println("Enter exit to get the unique char count");

		String s = s1.next();

		while (!s.equalsIgnoreCase("exit")) {
			long count = Functions.Calc(s);
			System.out.println("Input String ->" + s + "\tCount-> " + count);
			s = s1.next();

		}
		s1.close();
	}
	
	public static void empDriver(){
		Set<Employee> s1 = new TreeSet<Employee>();
		Employee e1 = new Employee(1, "Shubham", "Jodhpur");
		Employee e2 = new Employee(1, "Rhythm", "Jaipur");
		Employee e3 = new Employee(2, "Prem", "Barmer");
		Employee e4 = new Employee(3, "Sonu", "Jaisalmer");
		Employee e5 = new Employee(4, "Rahul", "Pokaran");
		Employee e6 = new Employee(5, "Ishaan", "XXXX");
		Employee e7 = new Employee(3, "Lal", "XXXXY");
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(e4);
		s1.add(e5);
		s1.add(e6);
		s1.add(e7);
		System.out.println("Emp Size " + s1.size());

		System.out.println("Sort in Natural Order");
		for(Employee e : s1){
			System.out.println("Id :- "+e.employeeId);
			System.out.println("Name :- "+e.employeeName);
			System.out.println("Address :- "+e.employeeAddress+"\n");
			
		}
		
		System.out.println("Sort by Employee Name");
		List<Employee> listOfEmployee = Employee.sortbyname(s1);
		for(Employee e : listOfEmployee){
			System.out.println("Id :- "+e.employeeId);
			System.out.println("Name :- "+e.employeeName);
			System.out.println("Address :- "+e.employeeAddress+"\n");
			
		}
	}
	
	public static void moleculeDriver(){
		String s1,s2;
		s1 = "C(OH)2";
		s2 = " CHOC(CH3)3";
		int r1,r2;
		r1 = Functions.evaluate(s1);
		r2 = Functions.evaluate(s2);
		System.out.println(s1 + " - " + r1+"\n");
		System.out.println(s2 + " - " + r2);
	}
	
	
}
