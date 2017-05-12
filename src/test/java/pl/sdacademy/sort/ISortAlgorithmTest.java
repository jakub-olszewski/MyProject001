package pl.sdacademy.sort;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ISortAlgorithmTest {

    ISortAlgorithm sortAlgorithm = new SortAlgorithm();
    int[] unSortedTable = { 1, 5, 87, 2, 4 };
    int[] sortedTableAsc = { 1, 2, 4, 5, 87 };
    int[] sortedTableDesc = { 87, 5, 4, 2, 1 };

    @Test
    public void shouldTestIsTableEqual() {
	int[] table1 = { 87, 5, 4, 2, 1 };
	int[] table2 = { 87, 5, 4, 2, 1 };

	assertTrue(isTableEqual(table1, table2));
    }

    @Test
    public void shouldTestIsTableNotEqual() {
	int[] table1 = { 87, 5, 4, 2, 1 };
	int[] table2 = { 9, 5, 4, 2, 1 };

	assertFalse(isTableEqual(table1, table2));
    }

    /**
     * Test sprawdzajacy czy tablica jest domyslnie posortowana rosnaco
     */
    @Test
    public void shouldSortArrayAscendingByDefault() {
	// given unSortedTable

	// when
	sortAlgorithm.sort(unSortedTable);

	// then

	assertTrue(isTableEqual(unSortedTable, sortedTableAsc));
    }

    /**
     * Ta metoda porównuje dwie tablice z warunków wejściowych z tablica
     * sortedTable
     * 
     * @param sortedTable
     * @return
     */
    private boolean isTableEqual(int[] tableToSort, int[] sortedTable) {
	boolean isAllElementEqualOrEndofTable = true;
	int i = 0;
	while (isAllElementEqualOrEndofTable) {
	    isAllElementEqualOrEndofTable = tableToSort[i] == sortedTable[i] || !isEndOfTable(tableToSort, i);
	    i++;
	}
	return isAllElementEqualOrEndofTable;
    }

    private boolean isEndOfTable(int[] tableToSort, int i) {
	return i == tableToSort.length;
    }

    /**
     * Test sprawdzajacy czy tablica jest posortowana malejaco
     */
    @Test
    public void shouldSortArrayDependingOnTheOrder() {
	// given unSortedTable
	// ISortAlgorithm sortAlgorithm = null;

	// when
	sortAlgorithm.sort(unSortedTable, false);

	// then
	assertTrue(isTableEqual(unSortedTable, sortedTableDesc));
    }

    /**
     * Test sprawdzajacy czy posortowana tablica</br>
     * pozostanie posortowana po uzyciu metody sortujacej
     */
    @Test
    public void shouldLeaveSortedSortArrayUnchanged() {
	// given unSortedTable
	// ISortAlgorithm sortAlgorithm = null;
	int[] tableToSortTemp = { 1, 2, 4, 5, 87 };

	// when
	sortAlgorithm.sort(tableToSortTemp);

	// then
	assertTrue(isTableEqual(tableToSortTemp, sortedTableAsc));
    }

    /**
     * Test sprawdzajacy zrzucenie wyjatku w przypadku tablicy null
     */
    @Test
    public void shouldThrowExceptionIfArrayIsNull() {
	// given
	int[] notInitializedArray = null;
	boolean isArrayNull = false;
	// when
	try {
	    sortAlgorithm.sort(notInitializedArray);
	} catch (Exception e) {
	    isArrayNull = true;
	    e.printStackTrace();
	}
	// then
	assertTrue(isArrayNull);
    }

    /**
     * Test sprawdzajacy wykonania metody </br>
     * bez zrzucania wyjatku w przypadku tablicy pustej
     */
    @Test
    public void shouldNotThrowIfArrayIsZeroSize() {
	// given
	int[] emptyArray = {};
	boolean isThrowException = false;
	// when
	try {
	    sortAlgorithm.sort(emptyArray);
	} catch (Exception e) {
	    isThrowException = true;
	}
	// then

	assertFalse(isThrowException);

    }

    /**
     * Test sprawdzajacy czy elementy tablicy sortuja się </br>
     * w przypadku gdy elementy nie sa unikalne czyli</br>
     * powtarzaja sie
     */
    @Test
    public void shouldSortIfElementsAreNotUnique() {
	// TODO
	// given
	int[] notUniqueUnsortedTable = { 1, 3, 5, 7, 3, 1, 5 };
	int[] notUniqueSortedTable = { 1, 1, 3, 3, 5, 5, 7 };

	// when
	sortAlgorithm.sort(notUniqueUnsortedTable);

	// then
	assertTrue(isTableEqual(notUniqueUnsortedTable, notUniqueSortedTable));

    }
}
