package Java8NewFeaturesDurgaSir.predicate;

import java.util.function.Predicate;

public class TestPredicate {
	public static void main(String[] args) {
		Predicate<Employee> predicate1=employee->employee.salary>10000 && employee.isHavingGf==true;
		System.out.println(predicate1.test(new Employee(5000,false)));
	}
}

class Employee{
	int salary;
	boolean isHavingGf;
	
	Employee(int Salary,boolean isHavingGf){
		this.salary=Salary;
		this.isHavingGf=isHavingGf;
	}
}
