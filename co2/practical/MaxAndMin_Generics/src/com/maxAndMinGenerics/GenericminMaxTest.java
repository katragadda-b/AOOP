package com.maxAndMinGenerics;

public class GenericminMaxTest {
	public static void main(String args[]) {
		Integer[] intArray= {3, 5, 7, 2, 8};
		MinMax<Integer> intMinMax= new MinMaxImpl<>();
		System.out.println("Minimum: "+intMinMax.findMin(intArray));
		System.out.println("Maximum: "+intMinMax.findMax(intArray));
		
		String[] stringArray= {"apple","banana", "orange", "grapes", "pear"};
		MinMax<String> strMinMax= new MinMaxImpl<>();
		System.out.println("Minimum: "+strMinMax.findMin(stringArray));
		System.out.println("Maximum: "+strMinMax.findMax(stringArray));
		
		Float[] floatArray= {1.5f, 2.3f, 1.2f, 8.4f};
		MinMax<Float> floatMinMax= new MinMaxImpl<>();
		System.out.println("Minimum: "+floatMinMax.findMin(floatArray));
		System.out.println("Maximum: "+floatMinMax.findMax(floatArray));
	}

}
