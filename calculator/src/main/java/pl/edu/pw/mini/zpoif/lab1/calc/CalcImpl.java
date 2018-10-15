package pl.edu.pw.mini.zpoif.lab1.calc;

public class CalcImpl implements Calc{

	@Override
	public int calc(int a, int b) {
		return a * b;
	}

	@Override
	public int calcMore(int a, int b, int c) {
		return (a + b) * c ;
	}
	
}
