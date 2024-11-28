package com.lti.demos4.nestedClasses;
class MotherBoard {
	
	private   String model;
	   public MotherBoard(String model) {
	       this.model = model;
	   }

	 public void showUsbPorts()
	   {
		   USB u= new USB(); // can create an instance of inner class 
		   System.out.println(u.usb2);
	   }
	   
	   // static nested class
	    class USB{
	     private  int usb2 = 2;
	       int usb3 = 1;	     
	       
	       int getTotalPorts(){
	    	   
	           // accessing the variable model of the outer classs	    	   
	        
	    	  if(MotherBoard.this.model.equals("MSI")) {
	               return 4;
	           }
	           else {
	               return usb2 + usb3;
	           }
	    	   //return 0;
	       }
	   }
	}
	public class Main {
	   public static void main(String[] args) { 
		   

	       // create an object of the static nested class
	      // MotherBoard.USB usb = new MotherBoard.USB();
	      // System.out.println("Total Ports = " + usb.getTotalPorts());
	       
	      MotherBoard mb= new MotherBoard("Intel");
	    
	      mb.showUsbPorts();
	       
	   }
	}
