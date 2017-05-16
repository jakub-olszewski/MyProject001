package pl.sdacademy.search.sandbox;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import pl.sdacademy.search.ISearchAlgorithm;
import pl.sdacademy.utils.TableUtils;

public class ISearchAlgoritmTest {

    int[] randomArray;
    int[] sortedArray;
    ISearchAlgorithm searchAlgorithm;
    TableUtils tableUtils;

    @Before
    public void setUp() {
	randomArray = new int[] { 23, 1, 53, 7, 98, 3, 2 };
	sortedArray = new int[] { 1, 23, 55, 66, 77, 88, 9012 };

	tableUtils = new TableUtils();
	searchAlgorithm = new NaiveSearchAlgorithm();
    }

    private boolean shouldFindElementInArray(int elementToFind, int expectedElement, int[] array) {
	// given

	// when
	int receicedResult = searchAlgorithm.search(randomArray, elementToFind);

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

	assertTrue(false);
    }

    @Test
    public void shouldReturnInvalidIndexIfArrayLenghtIsZero() {

	assertTrue(false);
    }

    @Test
    public void shouldThrowIfArrayIsNull() {

	assertTrue(false);
    }
}
