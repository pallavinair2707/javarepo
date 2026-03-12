package pack1;

public class EmployeeTotalSalary extends Employee {
	int total_salary = salary + 100;
	public void EmployeeSalaryGenerate() {
		System.out.println(total_salary);
	}
	public static void main(String[] args) {
		EmployeeTotalSalary ets = new EmployeeTotalSalary();
		ets.EmployeeSalaryGenerate();
	}

}
