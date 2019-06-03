package com.design.pattern.prototype;

public class DeepCopyTest {

	static class Person {
		int age;
		String name;

		public Person(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}

		public Person() {
			super();
		}

	}

	static class Person2 implements Cloneable {
		int age;
		String name;

		public Person2(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}

		public Person2() {
			super();
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			 Person2 clone = (Person2)super.clone();
			 clone.name = this.name;
			 return clone;
			 

		}

		/**
		 * @throws CloneNotSupportedException
		 * 
		 */
		public static void main(String[] args)
				throws CloneNotSupportedException {
			/*
			 * Person p = new Person(12,"tom"); Person p2 = new Person(); p2 =
			 * p; System.out.println(p +" --"+ p2); p.age = 20;
			 * System.out.println(p2.age); p.name = "edward";
			 * System.out.println(p2.name);
			 */

/*			Person2 pp = new Person2(12, "tom");
			Person2 pp2 = (Person2) pp.clone();
			System.out.println(pp.age == pp2.age);
			System.out.println(pp.name.hashCode());
			System.out.println(pp2.name.hashCode());*/
			
		
/*			pp.age = 22;
			pp.name = "edward";
			System.out.println(pp.age + "--" + pp2.age + "--" + pp3.age);
			System.out.println(pp.name + "--" + pp2.name + "--" + pp3.name);*/
			// Object#cloneʵ�ֵ���ǳ������
			
			String a = "abcd";
			String b = "abcd";
			System.out.println(a.hashCode());
			System.out.println(b.hashCode());
			
		}

	}
}
