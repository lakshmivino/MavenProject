package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

    @Test
	public class TestNgTc2 {
		

		@Parameters({"Username","Password"})
		@Test()
		public  void Test_4(String Username , String Password) {
//			System.out.println("Username");
//			System.out.println("Password");
		}

}
