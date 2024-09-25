package search;

public class Main {
	 public static void main(String[] args) {
	        BinarySearch<Integer> integerSearch = new BinarySearch<>();
	        Integer[] intArray = {3, 6, 8, 1, 5, 9, 2};
	        int intKey = 6;
	        int intResult = integerSearch.binarySearch(intArray, intKey);
	        System.out.println("Integer Key " + intKey + " found at index: " + intResult);

	        BinarySearch<Double> doubleSearch = new BinarySearch<>();
	        Double[] doubleArray = {3.2, 6.4, 8.1, 1.5, 5.7, 9.0, 2.3};
	        double doubleKey = 5.7;
	        int doubleResult = doubleSearch.binarySearch(doubleArray, doubleKey);
	        System.out.println("Double Key " + doubleKey + " found at index: " + doubleResult);

	        BinarySearch<String> stringSearch = new BinarySearch<>();
	        String[] stringArray = {"apple", "orange", "banana", "grape", "pear"};
	        String stringKey = "grape";
	        int stringResult = stringSearch.binarySearch(stringArray, stringKey);
	        System.out.println("String Key '" + stringKey + "' found at index: " + stringResult);
	    }
}
