package project2;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortJUnitTest {
	@Test
	public void testMiddlePivot() {
		System.out.println("Testing Middle");
		int[] expected = { 10,20, 30, 40, 50, 60,70, 80, 90 };
		QuickSort sorter = new QuickSort();
		int[] input = {10, 80, 20, 30, 90, 40, 50, 70, 60};
		long startTime = System.currentTimeMillis();
		sorter.quickSortMiddle(input);
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println(duration);
		assertArrayEquals(expected, input);

	}

	@Test
	public void testLastPivot() {
		System.out.println("Testing Last");
		int[] expected = { 10,20, 30, 40, 50, 60,70, 80, 90 };
		QuickSort sorter = new QuickSort();
		int[] input = {10, 80, 20, 30, 90, 40, 50, 70, 60};
		long startTime = System.currentTimeMillis();
		sorter.quickSortLast(input);
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println(duration);
		assertArrayEquals(expected, input);
	}

	@Test
	public void testRandomPivot() {
		System.out.println("Testing Random");
		int[] expected = { 10,20, 30, 40, 50, 60,70, 80, 90 };
		QuickSort sorter = new QuickSort();
		int[] input = {10, 80, 20, 30, 90, 40, 50, 70, 60};
		long startTime = System.currentTimeMillis();
		sorter.quickSortRandom(input);
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println(duration);
		assertArrayEquals(expected, input);
	}

	@Test
	public void testHundred() {
		System.out.println("Testing 100");
		QuickSort sorter = new QuickSort();
		int[] newArray = new int[100];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = sorter.randomFill();
		}
		int[] ArrayExpected = newArray;
		long startTime = System.currentTimeMillis();
		sorter.quickSortMiddle(newArray);
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println(duration);
		assertArrayEquals(ArrayExpected, newArray);
	}
	@Test
	public void testMillion() {
		System.out.println("Testing Million");
		QuickSort sorter = new QuickSort();
		int[] newArray = new int[1000000];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = sorter.randomFill();
		}
		int[] ArrayExpected = newArray;
		long startTime = System.currentTimeMillis();
		sorter.quickSortMiddle(newArray);
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println(duration);
		assertArrayEquals(ArrayExpected, newArray);
	}
	@Test
	public void testBillion() {
		System.out.println("Testing 100 Million");
		QuickSort sorter = new QuickSort();
		int[] newArray = new int[100000000];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = sorter.randomFill();
		}
		int[] ArrayExpected = newArray;
		long startTime = System.currentTimeMillis();
		sorter.quickSortMiddle(newArray);
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println(duration);
		assertArrayEquals(ArrayExpected, newArray);
	}
}
