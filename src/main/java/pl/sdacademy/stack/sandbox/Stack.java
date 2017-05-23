package pl.sdacademy.stack.sandbox;

import java.lang.reflect.Array;

import pl.sdacademy.stack.IStack;

public class Stack<T> implements IStack<T> {

	private int maksymalnyRozmiarStosu;
	private T[] tablicaStosu;
	private int wierzcholek;

	public Stack(int rozmiarStosu, Class<T> klasaElementowStosu) {
		maksymalnyRozmiarStosu = rozmiarStosu;
		// stworzenie tablicy elementow danej klasy
		tablicaStosu = (T[]) Array.newInstance(klasaElementowStosu, rozmiarStosu);
		wierzcholek = -1;
	}

	@Override
	public void push(T element) {
		if (wierzcholek < maksymalnyRozmiarStosu - 1) {
			wierzcholek++;
			tablicaStosu[wierzcholek] = element;
		}
	}

	@Override
	public T pop() {
		T pierwszyElement = tablicaStosu[wierzcholek];
		tablicaStosu[wierzcholek] = null;
		wierzcholek--;
		return pierwszyElement;
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			return null;
		} else {
			return tablicaStosu[wierzcholek];
		}
	}

	@Override
	public int size() {
		return wierzcholek + 1;
	}

	@Override
	public boolean isEmpty() {
		return wierzcholek == -1;
	}

}
