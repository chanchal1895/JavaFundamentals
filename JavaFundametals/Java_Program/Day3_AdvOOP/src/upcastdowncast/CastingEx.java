package upcastdowncast;


class Building {}  //parent
class House extends Building{}


public class CastingEx {
	
	public static void main(String[] args) 
	{
		Building b =  new Building();   // parent obj
		House h = new House();    // child obj 
		Building bh = new House();  //yes 
		House p = (House) b;  		
		//House q =  h; 
		//House r = (House) bh; 
	}

}
