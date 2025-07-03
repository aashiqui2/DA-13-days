package com.interfaces;

public interface OfficeRules {
	public final int salary=20000;//bydefault it is final
	public abstract void wearFormals();
	public abstract void work_8_Hours();
	
    //default
	default void display()
	{
		System.out.println("i am display from office rules");
	}
	//static
	static void show()
	{
		System.out.println("please implement two abstarct of my method");
	}
	
}
