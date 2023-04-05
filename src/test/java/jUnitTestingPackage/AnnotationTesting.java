package jUnitTestingPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class AnnotationTesting {

	
	
	
	
	
	
	@Before
	public void beforeClass( ) {
		System.out.println("Excuting Before test");
		
}
	
	@Test
	public void test1() {
		System.out.println("Excuting test1");
	}
		
	
	@Test
	public void test2() {
		System.out.println("Excuting test2");
	}
	
	@After
	
	public void afterClass() {
		System.out.println("Excuting After test");
	}
	
}
