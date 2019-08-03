package TestClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
@BeforeMethod
public void test1(){
	System.out.println("beforeMethod");
}

@AfterMethod
public void test2(){
	System.out.println("afterMethod");
}
@Test
public void test3(){
	System.out.println("Test");
}
@BeforeClass
public void test4(){
	System.out.println("BeforeClass");
}
@AfterClass
public void test5(){
	System.out.println("AfterClass");
}
@BeforeTest
public void test6(){
	System.out.println("Beforetest");
}
@AfterTest
public void test7(){
	System.out.println("Aftertest");
}
}
