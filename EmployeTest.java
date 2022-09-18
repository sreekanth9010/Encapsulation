package encapsulation;


class Employee {

	private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;
	
	

	public String getEmployeeId() {
		return employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public int getSalary() {
		return salary;
	}



	public int getBonus() {
		return bonus;
	}



	public int getJobLevel() {
		return jobLevel;
	}



	public Employee(String employeeId, String employeeName, int salary, int jobLevel) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		
		this.jobLevel = jobLevel;
	}



	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}
}
public class EmployeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("C101","Steve",650,4);
		employee.calculateSalary();

		System.out.println("Employee Details");
		System.out.println("Employee Id: " + employee.getEmployeeId());
		System.out.println("Employee Name: " + employee.getEmployeeName());
		System.out.println("Salary: " + employee.getSalary());
	}

}
