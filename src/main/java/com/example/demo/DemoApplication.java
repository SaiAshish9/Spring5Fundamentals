package com.example.demo;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.core.SpringVersion;
import com.example.demo.basic.BinarySearch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.SpringVersion;


// spring-core where beans are defined
// 

//<dependency>
//<groupId>org.springframework.boot</groupId>
//<artifactId>spring-boot-starter</artifactId>
//</dependency>



// component scan 
// automatically search packages and sub packages
//@SpringBootApplication

@Configuration
@ComponentScan
// SpringBoot automatically defines package where configuration is present
public class DemoApplication {

	public static void main(String[] args) {
//	    BinarySearch binarySearch=new BinarySearch(new BubbleSort());
//	    BinarySearch binarySearch=new BinarySearch(new QuickSort());
	    
//	Application Context ->	QuickSort And BubbleSort Beans are managed by application context
//		ApplicationContext applicationContext=SpringApplication.run(DemoApplication.class, args);	
		try(AnnotationConfigApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(DemoApplication.class)){
		BinarySearch binarySearch= applicationContext.getBean(BinarySearch.class);
		BinarySearch binarySearch1= applicationContext.getBean(BinarySearch.class);
		int result=binarySearch.binarySearch(new int[] {12,4,6,8},4);
	    System.out.println(binarySearch);
	    System.out.println(binarySearch1);
	    
//	    System.out.println(SpringVersion.getVersion());
	    
//	    applicationContext.close();
		}	}
}

// What are beans? --> @component annotation
// What are the dependencies of a bean? -> @autowired
// Where to search for beans?
// Dependency Management 



//<dependency>
//<groupId>org.slf4j</groupId>
//<artifactId>slf4j-api</artifactId>
//</dependency>


//<dependency>
// <groupId>ch.qos.logback</groupId>
// <artifactId>logback-classic</artifactId>
//</dependency>


