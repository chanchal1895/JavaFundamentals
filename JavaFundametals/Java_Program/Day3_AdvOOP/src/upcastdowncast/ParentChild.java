package upcastdowncast;
/*
Casting an object from a subclass to a superclass doesn’t require an explicit cast.
2. Casting an object from a superclass to a subclass requires an explicit cast.
3. The compiler will not allow casts to unrelated types.
4. Even when the code compiles without issue, an exception may be thrown at runtime if 
the object being cast is not actually an instance of that class.*/

class Parent 
{
int property = 999999;
	
	int sal=10000;
	
	void shopping() 
	{
		System.out.println("parent card money :" + property +"sal " +sal);
	}
}
class Child extends Parent 
{
	int sal = 100000;
	
	void shopping() 
	{
		System.out.println("shopping via sal :" + sal + " via property also " + property);
	}
}
public class ParentChild {

	public static void main(String[] args) {		
		
	
		
		Parent p = new Child();// upcasting		
		p.shopping();		
		System.out.println("\n");		
						
		//Child c = new Parent(); //downcasting not possible			
		
		Parent p1 = new Child();		
		
		//upcasted refences can be downcasted // no error at runtime 
		
	    Child c = (Child) p1; 	
	    
		c.shopping();
		c.sal=5000;
		
		//runtime errror -ClassCastException  
		Parent p2= new Parent();  
		 Child c1 = (Child) p2; 	
		
		
		

	}
}
