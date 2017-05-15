package pl.sdacademy.sort;

import java.util.Comparator;

public interface GenericSortAlgorithm {

    default <T extends Comparable<T>> void sort(T[] array) {
	sort(array, T::compareTo);
    };

    <T> void sort(T[] array, Comparator<T> comparator);

}
