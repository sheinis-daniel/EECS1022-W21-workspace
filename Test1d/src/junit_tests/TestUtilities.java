package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Utilities;

public class TestUtilities {
	
	/*
	 * Tests related to getBMIReport
	 */
	@Test
	public void test_getBMIReport_01() {
		String result = Utilities.getBMIReport("kilogram", 40, "foot", 5.57);
		assertEquals("BMI is: 13.88 (Underweight)", result);
	}
	
	@Test
	public void test_getBMIReport_02() {
		String result = Utilities.getBMIReport("kilogram", 70, "inch", 66.92);
		assertEquals("BMI is: 24.23 (Normal)", result);
	}
	
	@Test
	public void test_getBMIReport_03() {
		String result = Utilities.getBMIReport("pound", 154.3, "foot", 5.13);
		assertEquals("BMI is: 28.63 (Overweight)", result);
	}
	
	@Test
	public void test_getBMIReport_04() {
		String result = Utilities.getBMIReport("pound", 167.3, "inch", 60.92);
		assertEquals("BMI is: 31.69 (Obese)", result);
	}
	
	@Test
	public void test_getBMIReport_05a() {
		String result = Utilities.getBMIReport("Pounds", -154.3, "Inches", -66.92);
		assertEquals("Error: Pounds is not a valid weight unit", result);
	}
	
	@Test
	public void test_getBMIReport_05b() {
		String result = Utilities.getBMIReport("pound", -154.3, "Inches", -66.92);
		assertEquals("Error: Inches is not a valid height unit", result);
	}
	
	@Test
	public void test_getBMIReport_05c() {
		String result = Utilities.getBMIReport("pound", 154.3, "inch", -66.92);
		assertEquals("Error: both weight and height must be positive", result);
	} 
	
	@Test
	public void test_getBMIReport_06a() {
		String result = Utilities.getBMIReport("Poun", -154.3, "Inches", -66.92);
		assertEquals("Error: Poun is not a valid weight unit", result);
	}
	
	@Test
	public void test_getBMIReport_06b() {
		String result = Utilities.getBMIReport("pound", -154.3, "Inchs", -66.92);
		assertEquals("Error: Inchs is not a valid height unit", result);
	}
	
	@Test
	public void test_getBMIReport_06c() {
		String result = Utilities.getBMIReport("pound", 154.3, "inch", -66.92);
		assertEquals("Error: both weight and height must be positive", result);
	} 
	
	/*
	 * Tests related to get2ndAnd3rdLargest
	 */
	@Test
	public void test_getLargestTwoNumbers_01() {
		String result = Utilities.getSmallestTwoNumbers(1, 2, 3, 4);
		assertEquals("smallest is 1 and second smallest is 2", result);
	}
	
	@Test
	public void test_getLargestTwoNumbers_02() {
		String result = Utilities.getSmallestTwoNumbers(4, 3, 2, 1);
		assertEquals("smallest is 1 and second smallest is 2", result);
	}
	
	@Test
	public void test_getLargestTwoNumbers_03() {
		String result = Utilities.getSmallestTwoNumbers(3, 2, 4, 1);
		assertEquals("smallest is 1 and second smallest is 2", result);
	}
	
	@Test
	public void test_getLargestTwoNumbers_04() {
		String result = Utilities.getSmallestTwoNumbers(3, 2, 4, 2);
		assertEquals("smallest is 2 and second smallest is 2", result);
	}
	
	@Test
	public void test_getLargestTwoNumbers_05() {
		String result = Utilities.getSmallestTwoNumbers(2, 2, 4, 1);
		assertEquals("smallest is 1 and second smallest is 2", result);
	}
	
	@Test
	public void test_getLargestTwoNumbers_06() {
		String result = Utilities.getSmallestTwoNumbers(30, 10000, 4, 2);
		assertEquals("smallest is 2 and second smallest is 4", result);
	}
	
	/*
	 * Tests related to getLoserOfRPS
	 */
	@Test
	public void test_getLoserOfRPS_01() {
		String result = Utilities.getLoserOfRPS("Alan", 'r', "Mark", 'p');
		assertEquals("Alan", result);
	}
	@Test
	public void test_getLoserOfRPS_011243() {
		String result = Utilities.getLoserOfRPS("Alan", 's', "Mark", 'p');
		assertEquals("Mark", result);
	}
	@Test
	public void test_getLoserOfRPS_011d243() {
		String result = Utilities.getLoserOfRPS("Alan", 'p', "Mark", 's');
		assertEquals("Alan", result);
	}
	@Test
	public void test_getLoserOfRPSfdh_011243() {
		String result = Utilities.getLoserOfRPS("Alan", 's', "Mark", 'r');
		assertEquals("Alan", result);
	}
	
	@Test
	public void test_getLoserOfRPS_02() {
		String result = Utilities.getLoserOfRPS("Alan", 'r', "Mark", 'r');
		assertEquals("tie", result);
	}
}
