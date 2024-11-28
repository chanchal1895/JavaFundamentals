package com.lti.demos4.Tree;

public class Student 
{
	private int roll;
	private String name;
	private float fees;
	
	public Student() {
		super();
	}

	public Student(int roll, String name, float fees) {
		super();
		this.roll = roll;
		this.name = name;
		this.fees = fees;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(fees);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Float.floatToIntBits(fees) != Float.floatToIntBits(other.fees))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " \n Student: roll=" + roll + ", name=" + name + ", fees=" + fees + "]";
	}

	

	
}
