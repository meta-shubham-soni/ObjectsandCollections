import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Employee implements Comparable<Employee> {
	int employeeId;
	String employeeName;
	String employeeAddress;
	
	Employee(int id,String name,String address){
		employeeId = id;
		employeeName = name;
		employeeAddress = address;
	}

	@Override
	public int compareTo(Employee e1) {
		if (this.employeeId == e1.employeeId) {
			return 0;
		}
		return this.employeeId > e1.employeeId ? 1 : -1;
	}
	
	String getName(){
		return this.employeeName;
	}
	
	/*
	 * Function to Sort According to Name
	 * @return Set<Employee> of Employee
	 */
	public static List<Employee> sortbyname(Set<Employee> s1) {
		List<Employee> list = s1.parallelStream()
				.sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		return list;

	}
}
