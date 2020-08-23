package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// component scan 
// automatically search packages and sub packages
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//	    BinarySearch binarySearch=new BinarySearch(new BubbleSort());
//	    BinarySearch binarySearch=new BinarySearch(new QuickSort());
	    
//	Application Context ->	QuickSort And BubbleSort Beans are managed by application context
		ApplicationContext applicationContext=SpringApplication.run(DemoApplication.class, args);	
		BinarySearch binarySearch= applicationContext.getBean(BinarySearch.class);
		int result=binarySearch.binarySearch(new int[] {12,4,6,8},4);
	    System.out.println(result);
	}
}

// What are beans? --> @component annotation
// What are the dependencies of a bean? -> @autowired
// Where to search for beans?
// Dependency Management 