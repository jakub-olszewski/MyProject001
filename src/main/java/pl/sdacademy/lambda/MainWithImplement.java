package pl.sdacademy.lambda;

public class MainWithImplement {

    public static void main(String[] args) {
	ISumInt object = new ISumInt() {

	    @Override
	    public int sum(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
		    result += i;
		}
		return result;
	    }
	};
	int sum = object.sum(5);
	System.out.println("sum=" + sum);
    }
}
