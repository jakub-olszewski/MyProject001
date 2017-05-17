package pl.sdacademy.search.generic;

import static org.junit.Assert.assertTrue;

import java.util.function.Predicate;

import org.junit.Before;
import org.junit.Test;

import pl.sdacademy.utils.TableUtils;

public class IGenericSearchAlgorithmTest {
    int invalidIndex;
    Integer[] randomArray;
    Integer[] sortedArray;
    Integer[] emptyArray;
    IGenericSearchAlgorithm<Integer> searchAlgorithm;
    TableUtils tableUtils;

    @Before
    public void setUp() {

	invalidIndex = -1;

	randomArray = new Integer[] { 23, 1, 53, 7, 98, 3, 2 };
	sortedArray = new Integer[] { 1, 23, 55, 66, 77, 88, 9012 };
	emptyArray = new Integer[0];

	tableUtils = new TableUtils();
	searchAlgorithm = null;
    }

    private boolean shouldFindElementInArray(int elementToFind, int expectedElement, Integer[] array) {
	// given

	// when
	int receicedResult = -1;
	try {
	    Predicate<Integer> condition = p -> p == elementToFind;
	    receicedResult = searchAlgorithm.search(array, condition);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	// then
	boolean result = (receicedResult == expectedElement);

	return result;
    }

    @Test
    public void shouldFindElementInARandomArray() {
	int element = 7;
	int elementExpected = 3;
	boolean result = shouldFindElementInArray(element, elementExpected, randomArray);
	assertTrue("Can't find element = " + element + " in values: " + tableUtils.print(randomArray), result);

    }

    @Test
    public void shouldFindElementInSortedArray() {

	boolean result = shouldFindElementInArray(23, 1, sortedArray);
	assertTrue("Can't find element = " + 23 + " in values: " + tableUtils.print(sortedArray), result);
    }

    @Test
    public void shouldReturnInvalidIndexIfElementNotPresent() {
	int searchResult = 0;
	try {
	    searchResult = searchAlgorithm.search(randomArray, 31);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	assertTrue("Invalid index doesn't exist", searchResult < 0);
    }

    @Test
    public void shouldReturnInvalidIndexIfArrayLenghtIsZero() {

	int receivedResult = 0;
	try {
	    receivedResult = searchAlgorithm.search(emptyArray, 2);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	assertTrue("Array is empty", receivedResult < 0);
    }

    @Test
    public void shouldThrowIfArrayIsNull() {
	boolean hasThrow = false;
	int[] array = null;
	int value = 4;
	try {
	    searchAlgorithm.search(array, value);
	} catch (Exception e) {

	    hasThrow = true;
	}

	assertTrue("It doesn't throw exeption", hasThrow);
    }

}
