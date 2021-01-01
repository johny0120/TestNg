package SampleTestNg;

import org.testng.annotations.Test;

public class Day1TestNg {
	
	@Test (priority=0)
	public void StartTheCar() {
		System.out.println("Start The Car");
		
	}
	@Test(priority=1)
	public void PutFristGear() {
		System.out.println("First Geart");
		
	}
	@Test(priority=2)
	public void PutSecoundGear() {
		System.out.println("Secound Gear");
		
	}
	@Test(priority=3)
	public void PutThirdGear() {
		System.out.println("Third Gear");
	}

}
