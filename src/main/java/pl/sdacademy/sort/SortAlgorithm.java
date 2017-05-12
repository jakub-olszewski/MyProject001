package pl.sdacademy.sort;

import pl.sdacademy.utils.TableUtils;

public class SortAlgorithm implements ISortAlgorithm {

    public SortAlgorithm() {
	// TODO Auto-generated constructor stub
    }

    /**
     * Jak testować implementacje ?</br>
     * https://drive.google.com/file/d/0B4cxGqCXZKnKdEpMbVExR3lTeDg/view?usp=
     * sharing wejsc w powyzszy link</br>
     * testować na przykladzie z obrazka</br>
     * wypisywac krok po kroku kolejne iteracje petli</br>
     * i sprawdzac czy sa jak na obrazku. </br>
     * </br>
     * Po wykonaniu implementacji testujemy. </br>
     * Możemy testować w trakcie implementacji</br>
     * Implementacja będzie zakończona,</br>
     * gdy wszystkie testy będą zakończone sukcesem.
     * 
     */
    @Override
    public void sort(int[] array, boolean ascending) {
	if (array == null) {
	    throw new NullPointerException();
	}
	TableUtils tableUtils = new TableUtils();

	if (ascending) {
	    int temp;
	    for (int i = 0; i < array.length - 1; i++) {

		for (int j = 1; j < array.length - i; j++) {
		    if (array[j - 1] > array[j]) {
			temp = array[j - 1];
			array[j - 1] = array[j];
			array[j] = temp;
		    }
		}
		tableUtils.print(array);
	    }
	} else {
	    int temp;
	    for (int i = 0; i < array.length - 1; i++) {

		for (int j = 1; j < array.length - i; j++) {
		    if (array[j - 1] < array[j]) {
			temp = array[j - 1];
			array[j - 1] = array[j];
			array[j] = temp;
		    }
		}
		tableUtils.print(array);
	    }
	}

    }

}
