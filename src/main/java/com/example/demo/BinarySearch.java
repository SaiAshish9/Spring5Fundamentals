package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
    
	@Autowired
	private SortAlgorithm bubbleSort;
//    private SortAlgorithm sortAlgorithm;
	
//	private SortAlgorithm bubbleSort works without autowiring
	
//	sortAlgorithm is a dependency for binary search
//    mandatory dependencies -> constructor injection
//	  optional dependencies -> setter injection
   
//	public BinarySearch(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}

	
// setter injection and constructor injection or no setter,constructor

	public int binarySearch(int[] numbers,int numberToSearch) {
	
		int[] sortedNumbers=bubbleSort.sort(numbers);
        System.out.println(bubbleSort);
//		linear search
//		binary search loose coupling
		
		return 3;

	}


//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
}
