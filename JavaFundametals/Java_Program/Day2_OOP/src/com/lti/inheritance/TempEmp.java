package com.lti.inheritance;

public class TempEmp extends Person{
	
	private double noOFDays;
	private double perDaySal;
	
	
	  public void calc()
	  { 
		  double gSal=noOFDays*perDaySal;
		  System.out.println("gSal " + gSal); 
	  }
	 
	

	public TempEmp() {
		super();
	}
	
	public TempEmp(int personId, String personName,double noOFDays, double perDaySal) {
		super();
		this.personId=personId;
		this.personName=personName;
		this.noOFDays = noOFDays;
		this.perDaySal = perDaySal;
	}

	public TempEmp(double noOFDays, double perDaySal) {
		super();
		this.noOFDays = noOFDays;
		this.perDaySal = perDaySal;
	}


	@Override
	public String toString() {
		return "TempEmp [noOFDays=" + noOFDays + ", perDaySal=" + perDaySal +" personId  " +personId + " personName  " +personName +  "]";
	}
	
	

}
