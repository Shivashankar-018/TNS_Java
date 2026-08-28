package org.tnsif.acc.c2tc.exceptionhandling;


import java.io.IOException;

public class Throws {

	void print()
	{
		System.out.println("Hello World");
	}
	void fileReading() throws IOException
	{
		System.out.println("File not Found");
	}
	void Division() throws ArithmeticException ,ClassNotFoundException,IOException
	{
		System.out.println("Can't divide by zero");
	}

	public static void main(String[] args) {
		Throws obj=new Throws();
	     obj.print();
	     
	     
	     try {
	    	 obj.fileReading();
	     }catch(IOException e)
	     {
	    	 System.out.println(e);
	     }
	     
	     try {
	    	 obj.Division();
	     }catch(ArithmeticException e)
	     {
	    	 System.out.println(e);
	     }catch(ClassNotFoundException e)
	     {
	    	 System.out.println(e);
	     }
	     catch(IOException e)
	     {
	    	 System.out.println(e);
	     }
	      
	     
	}

}