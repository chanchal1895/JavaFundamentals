package upcastdowncast;

class Computer {
	int ram = 8;
	public void startup() {
		System.out.print("computer-" + ram);
	}
}

class Laptop extends Computer {
	int ram = 10;
	public void startup() {
		System.out.print("laptop-" );
		
	}
}
public class Test1
{
	public static void main(String[] args) {
		
	//	Laptop computer = new Laptop();
		Computer computer = new Laptop();		
		
		computer.startup();
		System.out.println(computer.ram);
		
		Laptop laptop = new Laptop();
		laptop.startup();
	}
}