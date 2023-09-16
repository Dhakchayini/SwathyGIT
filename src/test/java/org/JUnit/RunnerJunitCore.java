package org.JUnit;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunnerJunitCore {

	@Test
	
	public void exceute() {
		
		Result runClasses = JUnitCore.runClasses(RunnerAssertFb.class,RunnerAssertFb1.class);
		
		System.out.println("FailureCount is :"+ runClasses.getFailureCount());
		System.out.println("RunCount  is :"+ runClasses.getRunCount());
		System.out.println("IgnoreCount is :"+ runClasses.getIgnoreCount());
		System.out.println("RunTime is :"+ runClasses.getRunTime());
		System.out.println("class is :"+ runClasses.getClass());
		System.out.println("FailureCount is :"+ runClasses.getFailures());
	
	
	
	}
}
