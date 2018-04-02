package project2;

import java.util.Random;

public class QuickSort {

	private int array[];
	private int length;
    Random rand = new Random();

	public void quickSortLast(int[] inputArray) 
	{

		this.array = inputArray;
		length = inputArray.length;
		quickSortLast(0, length - 1);
	}


	public void quickSortMiddle(int[] inputArray)
	{
		this.array = inputArray;
		length = inputArray.length;
		quickSortMiddle(0, length - 1);
	}


	public void quickSortRandom(int[] inputArray) 
	{

		this.array = inputArray;
		length = inputArray.length;
		quickSortRandom(0, length - 1);
	}

	private int findLast() 
	{
		int end = array.length-1;
		int pivot = array[end];
		System.out.println("Current pivot position is" + pivot);
		return pivot;
	}
	
	private int findMiddle(int lowerIndex, int enderIndex) 
	{
		int pivot = array[lowerIndex + (enderIndex - lowerIndex) / 2];
		System.out.println("Current pivot position is" + pivot);
		return pivot;
	}

	private int findRandom() 
	{
		Random r = new Random();
		int low = 0;
		int end = array.length;
		int Result = r.nextInt(end - low) + low;

		int pivot = array[Result];
		System.out.println("Current pivot position is" + pivot);
		return pivot;
	}


	public void quickSortMiddle(int low, int high)
	{
		int i = low;
		int j = high;
		int pivotNumber = findMiddle(low, high);
		while (i <= j) {
			while (array[i] < pivotNumber)
			{
				i++;
			}
			while (array[j] > pivotNumber) 
			{
				j--;
			}
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
				i++;
				j--;
			}
		}
		if (low < j)
			quickSortMiddle(low, j);
		if (i < high)
			quickSortMiddle(i, high);
	}

	private void quickSortRandom(int low, int high)
	{
		int i = low;
		int j = high;
		int pivotNumber = findRandom();
		while (i <= j) {
			while (array[i] < pivotNumber) 
			{
				i++;
			}
			while (array[j] > pivotNumber) 
			{
				j--;
			}
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
				
				i++;
				j--;
			}
		}
		if (low < j)
			quickSortRandom(low, j);
		if (i < high)
			quickSortRandom(i, high);
	}

	public void quickSortLast(int start, int end) {
		int i = start;
		int j = end;
		int pivotNumber = findLast();
		while (i <= j) {
			while (array[i] < pivotNumber) {
				i++;
			}
			while (array[j] > pivotNumber) {
				j--;
			}
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
				i++;
				j--;
			}
		}
		if (start < j)
			quickSortRandom(start, j);
		if (i < end)
			quickSortRandom(i, end);
	}

	public int[] generateArray(int n)
    {
        int[] array = new int[n]; 
        
        for(int i = 0; i < array.length; i++)
        {   
            array[i] = rand.nextInt(100000) ;        
        }
        
        return array;
    }
	
	public static int randomFill()
	{
		Random rand = new Random();
		int randomNum = rand.nextInt();
		return randomNum;
	}

}