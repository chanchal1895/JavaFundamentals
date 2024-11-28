package com.lti.user;



class FaceBook
{
	int userId;		
	int ctr;		
	
	static int like=0;
	
	public void incr()
	{
		ctr++;
		System.out.println(userId + " ");
		System.out.println(ctr);
		
	}
	
	static public void likes()
	{
		like++;
		System.out.println(" " + like);
	}
	
	
	public FaceBook(int userId) {
			super();
			this.userId = userId;
		}

	@Override
	public String toString() {
		return "FaceBook [userId=" + userId + ", ctr=" + ctr + "]";
	}
	
	
}

public class TestFaceBook {
	
	public static void main(String[] args) {
		
		FaceBook user1= new FaceBook(101);
		user1.incr();
		FaceBook.likes();
		
		FaceBook user2= new FaceBook(102);
		user2.incr();		
		FaceBook.likes();
		
		FaceBook user3= new FaceBook(103);
		user3.incr();
		FaceBook.likes();
		
		
		
		
		
		
	}
	
	

}
