package pl.sdacademy.lambda;

public class SumInt implements ISumInt {

    @Override
    public int sum(int n) {
	return calculateSum(n);
    }

    public static int calculateSum(int n) {
	int result = 0;
	for (int i = 0; i < n; i++) {
	    result += i;
	}
	return result;
    }

}
