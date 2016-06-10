package com.orilore.lr.test1;

public class Student {

	private String name;

	private String number;

	public Student(String number, String name) {

		this.name = name;

		this.number = number;
	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getNumber() {

		return number;

	}

	public void setNumber() {

		this.number = number;

	}

	public int hashCode() {      //规定了固定的hashCode

		return 1;

	}

	public boolean equals(Object o) {

		boolean f = false;

		Student stu = (Student) o;

		if (this.number.equals(stu.getNumber()) && this.name.equals(stu.getName())) {

			f = true;
		}

		return f;

	}

}
