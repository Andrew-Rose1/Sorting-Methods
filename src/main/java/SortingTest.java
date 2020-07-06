import java.util.*;

public class SortingTest{
	public static void main(String[] args) {
		SortingTest obj = new SortingTest();
		// DO NOT DELETE THE THREE TEST cases
		obj.test("insertSort", 10);
		obj.test("quicktSort", 20);
		obj.test("mergeSort", 30);
		// you are welcome to add more testing cases

	}

	// test any one of the three given sorting algorithms in SortingPack
	// parameters:
		// sortAlgorithm - string, name of the sorting algorithm to be tested
		// size - int, the length of the randomly generated array
	// no return data
	public void test(String sortAlgorithm, int size) {
		SortingPack obj2 = new SortingPack();
		// Initialize new empty array, with a size declared in the method's paramaters
		int[] randomArr = new int[size];
		// Generate the new empty array with random integers
		for (int i = 0; i < size; i++) {
			randomArr[i] = (int)(Math.random()*100);
		}
		System.out.println("Testing for " + sortAlgorithm + " starts.");
		//start time
		long startTime = System.currentTimeMillis();
		// Print the unsorted array
		System.out.print("The randomly generated array is [");
		System.out.print(randomArr[0]);
		for (int j = 1; j < randomArr.length; j++) {
			System.out.print(", " + randomArr[j]);
		}
		System.out.print("]");
		System.out.println(" ");



		// Conditional statements to execute the correct method from SortingPack
		if (sortAlgorithm == "insertSort") {
			int[] sortedArr = obj2.insertionSort(randomArr);
			//END TIME
			long endTime = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			// Print out the time in ms the sorting method took to finish
			// Print the sorted array
			System.out.println("The sorting took " + totalTime + " milliseconds.");
			System.out.print("The sorted array is [");
			System.out.print(sortedArr[0]);
			for (int j = 1; j < sortedArr.length; j++) {
				System.out.print(", " + sortedArr[j]);
			}
			System.out.print("]");
		} else if (sortAlgorithm == "quicktSort") {
			int[] sortedArr = obj2.quickSort(randomArr);
			//END TIME
			long endTime = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			// Print out the time in ms the sorting method took to finish
			// Print the sorted array
			System.out.println("The sorting took " + totalTime + " milliseconds.");
			System.out.print("The sorted array is [");
			System.out.print(sortedArr[0]);
			for (int j = 1; j < sortedArr.length; j++) {
				System.out.print(", " + sortedArr[j]);
			}
			System.out.print("]");
		} else if (sortAlgorithm == "mergeSort") {
			int[] sortedArr = obj2.mergeSort(randomArr);
			//END TIME
			long endTime = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			// Print out the time in ms the sorting method took to finish
			// Print the sorted array
			System.out.println("The sorting took " + totalTime + " milliseconds.");
			System.out.print("The sorted array is [");
			System.out.print(sortedArr[0]);
			for (int j = 1; j < sortedArr.length; j++) {
				System.out.print(", " + sortedArr[j]);
			}
			System.out.print("]");
		} else {
			System.out.println("Error. Invalid sorting method.");
		}
		System.out.println(" ");
		System.out.println("Testing for " + sortAlgorithm + " ends.");
		System.out.println(" ");
		System.out.println(" ");
	}
}
