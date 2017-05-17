package pl.sdacademy.search.generic;

import java.util.function.Predicate;

/**
 * http://howtodoinjava.com/java-8/how-to-use-predicate-in-java-8/
 * 
 */
public interface IGenericSearchAlgorithm<T> {
    <T extends Comparable> int search(T[] array, Predicate<T> predicate);
}
