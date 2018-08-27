package com.wg.composite;

/**
 * 当有相同的结构的层级关系时候，一定记得使用组合设计模式
 * @author Administrator
 *
 */

public class CompositePatternDemo {

	public static void main(String[] args) {

		Employee kelly = new Employee("kelly", "hr");
		Employee sam = new Employee("sam", "hr");

		Employee lily = new Employee("lily", "financial");
		Employee lucy = new Employee("lucy", "financial");

		Employee HRDept = new Employee();
		HRDept.add(kelly);
		HRDept.add(sam);

		Employee FDept = new Employee();
		FDept.add(lily);
		FDept.add(lucy);

		Employee company = new Employee();
		company.add(HRDept);
		company.add(FDept);
		
		getAll(company);

	}

	// 打印所有的员工姓名
	static void getAll(Employee employee) {
		for (Employee e : employee.subordinates) {
			if (e.subordinates.size() > 0 ) {
				getAll(e);

			} else {
				System.out.println(e.dept + " --> " + e.name);
			}

		}
	}

}
