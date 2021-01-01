package SampleTestNg;

import org.testng.annotations.Test;

public class Day2SkipTestCases {
	
	@Test (priority=0)
	public void StartTheCar() {
		System.out.println("Start The Car");
		
	}
	// to skip the test cases using the boolean enabled = false
	
	@Test(priority=4,enabled=true)
	public void StartTheMusic() {
		System.out.println("Music IS on");
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
