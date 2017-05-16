package pl.sdacademy.search.sandbox;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import pl.sdacademy.search.ISearchAlgorithm;
import pl.sdacademy.utils.TableUtils;

public class ISearchAlgoritmTest {

    int[] randomArray;
    ISearchAlgorithm search;
    TableUtils tableUtils;

    @Before
    public void setUp() {
	randomArray = new int[] { 23, 1, 53, 7, 98, 3, 2 };
	tableUtils = new TableUtils();
	search = new NaiveSearchAlgorithm();
    }

    @Test
    public void shouldFindElementInARandomArray() {
	// given
	int valueToFind = 7;
	int expectedResult = 3;

	// when
	int receicedResult = search.search(randomArray, valueToFind);

	// then
	boolean result = (receicedResult == expectedResult);

	assertTrue("Can't find element = " + valueToFind + " in values: " + tableUtils.print(randomArray), result);
    }

    @Test
    public void shouldFindElementInSortedArray() {

	assertTrue(false);
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
