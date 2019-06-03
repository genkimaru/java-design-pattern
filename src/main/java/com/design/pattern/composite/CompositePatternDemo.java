package com.design.pattern.composite;

/**
 * ������ͬ�Ľṹ�Ĳ㼶��ϵʱ��һ���ǵ�ʹ��������ģʽ
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

	// ��ӡ���е�Ա������
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
