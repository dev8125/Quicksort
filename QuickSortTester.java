package project2;
public class QuickSortTester {
	public static void main(String[] args) {

		QuickSort sorter = new QuickSort();
		System.out.println("Input Array:");
		int[] input = {10, 80, 20, 30, 90, 40, 50, 70, 60};
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("---------------------------");
		System.out.println("Ordered Array:");
		sorter.quickSortMiddle(input);

		System.out.print("Actual: ");
		for (int i : input) {
			
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println(" ");
		String expected = "10 20 30 40 50 60 70 80 90";
		System.out.println("Expected: " + expected);
		
		System.out.println(" ");
		System.out.println("---------------------------");
		
		System.out.println("Input Array:");
		int[] input1 = {10, 80, 20, 30, 90, 40, 50, 70,60};
		for (int i : input1) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println(" ");

		System.out.println("Ordered Array");
		sorter.quickSortRandom(input1);

		for (int i : input1) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("---------------------------");
		
		System.out.println("Input Array:");
		int[] input2 = {10, 80, 20, 30, 90, 40, 50, 70,60};
		for (int i : input2) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println(" ");

		System.out.println("Ordered Array:");
		sorter.quickSortLast(input2);

		for (int i : input2) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println(" ");
		System.out.println("---------------------------");
		
		
	    
	    
	}
}