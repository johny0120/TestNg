package SampleTestNg;

import org.testng.annotations.Test;

public class GroupingExamples {
	
	// Scenario : A Bigbasket Is Having a different kind of Mobiles.
	// Let Us say there are apples phones, moto,VIVO, and lenovo.
	// I want to run tests only for ViVo and Moto phones 
	// Write AProgram For That
	@Test(groups= {"Apple"})
	 public void apple() {
		 System.out.println("Apple Testing");
	 }
	@Test(groups= {"Apple"})
	 public void apple1() {
		 System.out.println("Apple Testing 1");
	 }
	@Test(groups= {"moto"})
	 public void moto() {
		 System.out.println("Moto Testing");
		 
	 }
	@Test(groups= {"moto"})
	 public void moto1() {
		 System.out.println("Moto1 Testing");
	 }
	@Test(groups= {"VIVO"})
     public void vivo() {
    	 System.out.println("ViVo Testing1");
    	 
     }
	@Test(groups= {"VIVO"})
     public void vivo1() {
    	 System.out.println("ViVo Testing1");
    	 
     }
	@Test(groups= {"lenovo"})
     public void lenovo() {
    	 System.out.println("Lenovo Testing");
     }
	@Test(groups= {"lenovo"})
     public void lenovo1() {
    		 System.out.println("Lenovo Testing1");
    		 
    	 }
     
}
