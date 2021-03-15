package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PracticeTest {

	@Test
	void test() {
		assertEquals(Practice.maxMirror(new int[] {1,2,3,8,9,3,2,1}), 3);
	}
	@Test
	void teste() {
		assertEquals(Practice.maxMirror(new int[] {1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25}), 4);
	}
	@Test
	void tester() {
		assertEquals(Practice.maxMirror(new int[] {5, 9, 9, 4, 5, 4, 9, 9, 2}), 7);
	}
	@Test
	void teseter() {
		assertEquals(Practice.maxMirror(new int[] {1, 1, 1}), 3);
	}
	@Test
	void testewer() {
		assertEquals(Practice.maxMirror(new int[] {1}), 1);
	}

}
