package pl.sdacademy.list;

/**
 * Bardzo ważną metodą interfejsu Collection</br>
 * (tak naprawdę dzidziczoną z interfejsu Iterable) jest metoda iterator(),</br>
 * ktora zwraca iterator.</br>
 * 
 * Iterator jest obiektem klasy implementującej interfejs Iterator</br>
 * i służy do przeglądania elementów kolekcji oraz ew. usuwania ich przy</br>
 * przeglądaniu</br>
 * 
 * @author RENT
 *
 * @param <T>
 */
public interface IList<T> extends Iterable<T> {

    T getFirst();

    T getLast();

    T get(int index);

    void add(T element);

    void remove(int index);

    int size();

    boolean isEmpty();

}
