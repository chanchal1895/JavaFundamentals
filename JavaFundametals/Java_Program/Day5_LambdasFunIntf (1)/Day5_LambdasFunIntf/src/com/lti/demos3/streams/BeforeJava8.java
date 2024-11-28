package com.lti.demos3.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 
{
	public static void main(String[] args) {

        List<String> lines = Arrays.asList("Java", "DotNet", "Oracle","SQLServer");
        
        List<String> result = getFilterOutput(lines, "DotNet");
        
        for (String temp : result)
        {
            System.out.println(temp);    
        }
    }
    private static List<String> getFilterOutput(List<String> lines, String str) 
    {
        List<String> result = new ArrayList<>();
        
        for (String l : lines)
        {
            if (!"DotNet".equals(l)) 
            {          	
                result.add(l);
            }
        }
        return result;
    }

}
