package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
    
	@Autowired
    private SortAlgorithm sortAlgorithm;
		
//	sortAlgorithm is a dependency for binary search
    
   
	public BinarySearch(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int[] numbers,int numberToSearch) {
	
		int[] sortedNumbers=sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
//		linear search
//		binary search loose coupling
		
		return 3;

	}
	
}
