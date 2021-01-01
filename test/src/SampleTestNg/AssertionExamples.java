package SampleTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;



// Assertion is mainly used for Unit Testing 
// mainly for Developer not For (QA)

public class AssertionExamples {
	
	String Name = "Agni";
	boolean value= false;
	@Test
	public void checkEquals() {
	
	/*if(Name.equals("Agni")) {
		System.out.println("Name is Equal");
		
	}else {
	System.out.println("Name is NOT Equal");
    } */ 
		//Assert.assertNotEquals(Name, "agni");
		//Assert.assertEquals(Name, "Agni");
		//Assert.assertTrue(value, "This Should be true");  (It Shows An Error)
		//Assert.assertFalse(value,"This value Should be true");
		
	}
	}

