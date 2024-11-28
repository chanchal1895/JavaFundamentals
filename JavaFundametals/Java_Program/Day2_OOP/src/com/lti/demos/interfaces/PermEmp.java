package com.lti.demos.interfaces;

public class PermEmp  implements Person{
	
	private int empId;
	private double empSal;
	private double basicSal;	
	
	public void show()
	{
		System.out.println("show perm emp");
	}

	 public void calc()
	  { 
		  double gSal=basicSal*3;
		  System.out.println("pemp method " + gSal); 
	  }

	public PermEmp(int empId, double empSal, double basicSal) {
		super();
		this.empId = empId;
		this.empSal = empSal;
		this.basicSal = basicSal;
	}

	public PermEmp() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	@Override
	public String toString() {
		return "PermEmp [empId=" + empId + ", empSal=" + empSal + ", basicSal=" + basicSal + "]";
	}
	 
	


	


}
