package com.lti.demos5.designpattern;



import java.util.ArrayList;  
import java.util.List;  
//Packing interface for tablets
interface Packing {  
            public String pack();  
            public int price();  
}  
//Tablet class - abstract
abstract class Tablet implements Packing{  
public abstract String pack();  
}  
 
//company - extends Tablet
abstract class Company extends Tablet{  
   public abstract int price();  
} 
//Lenovo tablet
class Lenovo extends Company{ 
    @Override 
        public int price(){   
                        return 541;  
      }  
    @Override 
    public String pack(){  
             return "Lenovo Yoga";  
        }         
}
//Micromax tablet
class MicroMax extends Company {  
    @Override 
        public int price(){   
                        return 338;  
    }  
    @Override 
    public String pack(){  
             return "MicroMax";  
        }         
}
 //Tablet type
class TabType {  
             private List<Packing> items=new ArrayList<Packing>();  
             //add items
             public void addItem(Packing packs) {    
                    items.add(packs);  
             }  
         //retrieve cost
             public void getCost(){  
              for (Packing packs : items) {  
                        packs.price();  
              }   
             }  
             //show all items
             public void showItems(){  
              for (Packing packing : items){  
             System.out.print("Tablet name : "+packing.pack());  
             System.out.println(", Price(in U.S.Dollars) : "+packing.price());  
          }       
            }     
}
//builder class for tablets order
class TabBuilder {  
                  public TabType buildLenovoTab(){   
                     TabType lenovo =new TabType();  
                     lenovo.addItem(new Lenovo());  
                     return lenovo;  
              }  
              public TabType buildMicroMaxTab(){  
             TabType mmx=new TabType();  
             mmx.addItem(new MicroMax());  
             return mmx;  
              }  
}
public class Demo3_Builder {
	public static void main(String[] args) {
		//build the tablets order and display the order
		   TabBuilder tabBuilder=new TabBuilder();  
		   TabType tabtype1=tabBuilder.buildLenovoTab();  
		   tabtype1.showItems();  
		   
		   TabType tabtype2=tabBuilder.buildMicroMaxTab();  
		   tabtype2.showItems();  
	}
	
	

}
/*Advantages
Using the Builder pattern, we can separate the construction and representation of an object.
We also can change the internal representation of the object.
We can build complex designs like an entire delivery system using the builder pattern.
A practical example of a Builder pattern is the food ordering system which involved complex steps of collecting food items that are ordered, then packaging, billing, building order, and then shipping it.

*/
/*
 * ref dig :


Product: This represents the complex object to be built.
Builder Abstract class: An abstract class containing prototypes of all the functionality required to build a complex object.
ConcreteBuilder Class: This is a concrete class that inherits from the Builder class and creates a particular complex object. We can have as many ConcreteBuilder classes as we need.
Director class: This class controls the algorithms that generate the final product.
 */
