package bubblesort72;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 5, 3, 8, 4, 2 };
        System.out.println("Before sorting (Integer): ");
        SortUtil.printArray(intArray);
        SortUtil.bubbleSort(intArray);
        System.out.println("After sorting (Integer): ");
        SortUtil.printArray(intArray);
        Double[] doubleArray = { 5.5, 3.3, 8.8, 4.4, 2.2 };
        System.out.println("\nBefore sorting (Double): ");
        SortUtil.printArray(doubleArray);
        SortUtil.bubbleSort(doubleArray);
        System.out.println("After sorting (Double): ");
        SortUtil.printArray(doubleArray);
        String[] stringArray = { "banana", "apple", "orange", "grape", "cherry" };
        System.out.println("\nBefore sorting (String): ");
        SortUtil.printArray(stringArray);
        SortUtil.bubbleSort(stringArray);
        System.out.println("After sorting (String): ");
        SortUtil.printArray(stringArray);
    }
	}

}
