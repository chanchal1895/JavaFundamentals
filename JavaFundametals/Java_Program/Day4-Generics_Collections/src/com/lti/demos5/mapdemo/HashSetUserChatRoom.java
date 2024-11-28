package com.lti.demos5.mapdemo;

import java.util.HashSet;
import java.util.Set;

class User
{

private String userName;
    
    public User(final String name) {
        this.userName = name;
    }
    
    public String getUserName() {
    	return this.userName;
    }
 
   /* @Override
    public boolean equals(final Object obj) {
        boolean isEqual = false;
        if(obj == null) {
            isEqual = false;
        } else if(!(this.getClass().equals(obj.getClass()))) {
            isEqual = false;
        } else if(this.userName.equalsIgnoreCase(((User)obj).getUserName())) {
        	isEqual = true;
        }
        return isEqual;
    }
 
    @Override
    public int hashCode() {
    	return this.userName.toUpperCase().hashCode();
    }*/
    
    @Override
    public String toString() {
    	return this.userName;
    }
    
}
public class HashSetUserChatRoom {
	
    // for test
    public static void main(String[] args) 
    {
    	Set<User> chatRoomUsers = new HashSet<User>();
    	
    	chatRoomUsers.add(new User("user1"));
    	chatRoomUsers.add(new User("user1"));
    	chatRoomUsers.add(new User("user5"));
    	chatRoomUsers.add(new User("uSEr1"));
    	chatRoomUsers.add(new User("User1"));
    	chatRoomUsers.add(new User("user2"));
    	chatRoomUsers.add(new User("user4"));
    	chatRoomUsers.add(new User("user3"));
    	
    	// print chat room users
    	for (User usr : chatRoomUsers) {
    		System.out.println(usr);
    	}
    }

}
