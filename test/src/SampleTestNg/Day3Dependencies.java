package SampleTestNg;

import org.testng.annotations.Test;

public class Day3Dependencies {
	
	@Test(enabled=true)
	public void highSchool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods="highSchool")
	public void higherSecoundarySchool() {
		System.out.println("Higher Secoundary School");
		
	}
	@Test(dependsOnMethods="higherSecoundarySchool")
	public void engineeringCollege() {
	System.out.println("Engineering Clg");	
	}

}
