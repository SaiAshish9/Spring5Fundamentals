package com.example.demo.basic;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// returns two different instances
public class BinarySearch {
    
	private Logger logger =
		     (Logger) LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("bubble")
//	private SortAlgorithm bubbleSort
    private SortAlgorithm sortAlgorithm;
	
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
	
		int[] sortedNumbers=sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
//		linear search
//		binary search loose coupling
		
		return 3;

	}

//	LifeCycle of a bean --> PostConstruct and PreDestroy

	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDes() {
		logger.info("preDestroy");
	}
	
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
}
