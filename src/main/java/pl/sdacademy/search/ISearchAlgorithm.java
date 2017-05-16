package pl.sdacademy.search;

public interface ISearchAlgorithm {

    /**
     * Wyszukiwanie elementu w tablicy</br>
     * metoda zwraca pozycje w tablicy
     * 
     * @param array
     * @param value
     * @return
     * @throws Exception
     */
    int search(int[] array, int value) throws Exception;

}
