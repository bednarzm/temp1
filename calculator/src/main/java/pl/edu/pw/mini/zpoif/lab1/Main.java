package pl.edu.pw.mini.zpoif.lab1;

import pl.edu.pw.mini.zpoif.lab1.calc.Calc;
import pl.edu.pw.mini.zpoif.lab1.calc.CalcImpl;

public class Main {

	public static void main(String[] args) {
		Calc calc = new CalcImpl();
		System.out.println("It has been calculated by Main: " + calc.calc(1, 2));
	}

}
