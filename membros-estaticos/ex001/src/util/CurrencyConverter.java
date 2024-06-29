package util;

public class CurrencyConverter {
	
	public static final double DOLLAR_VALUE = 5.59;
	
	public static double converter(double dollar) {
		return (dollar * DOLLAR_VALUE ) + iof();
	}
	
	public static double iof() {
		// IOF = 6% em cima do valor do dollar
		return (DOLLAR_VALUE / 10) * 0.6;
	}
}
