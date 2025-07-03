package com.interfaces;

public class SoftewareEngineer extends Parent implements OfficeRules, TrafficeRules {
	public static void main(String[] args) {
//		SoftewareEngineer se = new SoftewareEngineer();
//      OfficeRules off=new OfficeRules();
		OfficeRules off  =new SoftewareEngineer();//dynamic binding
		off.wearFormals();
		//off.go_slow();
		//off.salary=30000;
		System.out.println(off.salary);
		OfficeRules.show();//static 
		off.display();//default
	}

	public void Take_break() {
		System.out.println("taking break");
	}

	@Override
	public void work() {
		System.out.println("working on jenkins");
	}

	@Override
	public void go_slow() {

		System.out.println("Go slow");
	}

	@Override
	public void go_left() {
		System.out.println("go left...");

	}

	@Override
	public void wearFormals() {
		System.out.println("wear formals");

	}

	@Override
	public void work_8_Hours() {
		System.out.println("work_8hours");

	}
}
