package upcastdowncast;

import java.util.ArrayList;

public class IsItFurry {
	
	 static class Chipmunk { }
	 
	 public static void main(String[] args) {
		 
	 Chipmunk c = new Chipmunk();
	 
	 int result = 0;
	 if (c instanceof Chipmunk) result += 1;
	
	 System.out.println(result);
	 } 
}