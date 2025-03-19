package com.exception;

public class Test1 
{
    public int m1()
    {
    	int x=10;
    	try
    	{
    		System.out.println("try--Block");
    		return x;
    	}
    	finally
    	{
    		x=30;
    		System.out.println("finally-Block:" +x);
    		return x;
    	}
    }
    public static void main(String[] args) 
    {
		System.out.println("main--");
		Test1 t=new Test1();
		int x=t.m1();
		System.out.println(x);
	}
}      
	/*public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			System.out.println("try-block start");
			int x=10/0;
			System.out.println("try-block-end");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block");
		}*/
		
		/*finally
		{
			System.out.println("finally-Block");
		}
		System.out.println("main end");

	}*/


