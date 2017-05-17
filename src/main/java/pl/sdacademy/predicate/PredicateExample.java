package pl.sdacademy.predicate;

import java.util.function.Predicate;

import pl.sdacademy.search.generic.IGenericSearchAlgorithm;

public class PredicateExample {

    public PredicateExample() {
    }

    public static void main(String[] args) {

	Predicate<Integer> condition = p -> p == 0;

	int number = 5;

	checkPredicate(condition, number);

	number = 0;

	checkPredicate(condition, number);

	number = 99;

	checkPredicate(p -> p == 99, number);

	IGenericSearchAlgorithm<Integer> searchAlgorithm = new IGenericSearchAlgorithm<Integer>() {

	    @Override
	    public <Integer extends Comparable> int search(Integer[] array, Predicate<Integer> predicate) {

		boolean condition = predicate.test(array[1]);
		if (condition) {
		    System.out.println("condition = true");
		} else {
		    System.out.println("condition = false");
		}
		return 100;
	    }
	};
	Integer[] table = new Integer[] { 1, 2, 3, 4 };

	int position = searchAlgorithm.search(table, n -> n == 2);

	System.out.println("position=" + position);
    }

    private static void checkPredicate(Predicate<Integer> condition, int number) {
	System.out.print(number);
	if (condition.test(number)) {
	    System.out.println(" is condition true");
	} else {
	    System.out.println(" is condition false");

	}
    }

}
