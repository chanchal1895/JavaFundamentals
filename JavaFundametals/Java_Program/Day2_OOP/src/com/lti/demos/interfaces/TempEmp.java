package com.lti.demos.interfaces;

public class TempEmp implements Person {
	
	private int empId;
	private double noOFDays;
	private double perDaySal;	
	
	  public void calc()
	  { 
		  double gSal=noOFDays*perDaySal;
		  System.out.println("temp method " + gSal); 
	  }
//can override default methods 
	 public String getRank() {
			 return "Second";
	}
	  
	public TempEmp() {
		super();
	}


	public TempEmp(int empId, double noOFDays, double perDaySal) {
		super();
		this.empId = empId;
		this.noOFDays = noOFDays;
		this.perDaySal = perDaySal;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public double getNoOFDays() {
		return noOFDays;
	}


	public void setNoOFDays(double noOFDays) {
		this.noOFDays = noOFDays;
	}


	public double getPerDaySal() {
		return perDaySal;
	}


	public void setPerDaySal(double perDaySal) {
		this.perDaySal = perDaySal;
	}


	@Override
	public String toString() {
		return "TempEmp [empId=" + empId + ", noOFDays=" + noOFDays + ", perDaySal=" + perDaySal + "]";
	}

	  
	  
}
