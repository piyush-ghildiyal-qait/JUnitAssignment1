package com.qainfotech.ConsecutiveLetter;



import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestConsecutiveString {		
	
ConsecutiveString obj = new ConsecutiveString();		


@Test
public void testConsecutiveString()	{	
	
	ConsecutiveString obj = new ConsecutiveString();				

           ArrayList<String> actualConsecutiveLetter = new ArrayList<String>();		
            ArrayList<String> expectedConsecutiveLetter = new ArrayList<String>();			

actualConsecutiveLetter.add("Hello");	
actualConsecutiveLetter.add("Winner");
actualConsecutiveLetter.add("Apple");		
//actualConsecutiveLetter.add("qaainfotech");			

expectedConsecutiveLetter.add("Hello");	
expectedConsecutiveLetter.add("Winner");
expectedConsecutiveLetter.add("Apple");	


ArrayList<String> actualConsecutiveLetterResult = obj.getConsecutiveString(actualConsecutiveLetter);		
		

assertEquals(expectedConsecutiveLetter,actualConsecutiveLetterResult);					
}
}
