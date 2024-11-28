package upcastdowncast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
public static void main(String[] args) {
//		
//		Manager m1= new Manager(100,"Jay");
//		m1.setWork("Finance");	
//		
//		Employee e= new Employee(102,"Viajy");
//		
//		Employee ref;
//		ref=m1;// implicit upcasting 
//		System.out.println(ref.toString());
//		
//	//	((Manager) e);//explicit downcasting
//		((Manager) e).setWork("Sales");
//	//	((Manager) e).doWork();
//		//System.out.println(m1.toString());
//		
//		
//	
	
	List<Employee> empList = new ArrayList<>();
	
	empList.add(new Employee(0, "Mahima", 1000)) ;
	empList.add(new Employee(0, "Raj", 1100)) ;
	empList.add(new Employee(0, "Dinesh", 1200)) ;
	empList.add(new Employee(0, "Karuna", 1300)) ;
	empList.add(new Employee(0, "Riddi", 1400)) ;
	
	List<Employee> list =empList.stream()
	.filter(em -> em.sal > 1100 )
	.collect(Collectors.toList());
	System.out.println(list);
//	String str = "silent";
//	char[] c1 = str.toCharArray();
//	Arrays.sort(c1);
//	int count = 0;
//	System.out.println(c1[0]);
//			String str1 = "lissten";
//			char[] c2= str1.toCharArray();
//			Arrays.sort(c2);
//		for(int i =0;i<c1.length;i++) {
//			if(c1[i]==c2[i]) {
//				count++;
//			}
//		}
//			if(count==c1.length) {
//				System.out.println("Anagram");
//			}else {
//				System.out.println("not anagram");
//			}
//			
////	for(int i=0;i<str1.length();i++) {
////	if(str1.contains(str.substring(i,i+1))){
////		count++;
////	}
////	}
//	
//	
	}

}
