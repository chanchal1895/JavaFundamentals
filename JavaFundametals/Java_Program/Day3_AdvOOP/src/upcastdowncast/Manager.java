package upcastdowncast;

public class Manager extends Employee{
	String work;

	
	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Manager(int id, String name) {
		super(id, name);
		
	}
	public void doWork()
	{
		System.out.println("manager's  work: "+ work);
	}

	@Override
	public String toString() {
		return "Manager [work=" + work + ", id=" + id + ", name=" + name + "]";
	}
	

}
