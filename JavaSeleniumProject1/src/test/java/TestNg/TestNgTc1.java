package TestNg;

import org.testng.annotations.Test;

public class TestNgTc1 {

@Test(priority=3,groups="A")
	public  void Test_1() {
		System.out.println("Login");
	}
@Test(priority=2,groups="B")
	public  void Test_2() {
		System.out.println("Create");
	}
@Test(groups="A")
	public  void Test_3() {
		System.out.println("Update");
	}
	

	

	
	
}


