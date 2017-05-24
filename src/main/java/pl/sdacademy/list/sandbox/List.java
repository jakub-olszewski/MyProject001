package pl.sdacademy.list.sandbox;

import java.util.Iterator;

import pl.sdacademy.list.IList;

public class List<T> implements IList<T> {

	ListElement<T> pierwszyElement;
	ListElement<T> ostatniElement;

	@Override
	public T getFirst() {
		return pierwszyElement.getValue();
	}

	@Override
	public T getLast() {
		return ostatniElement.getValue();
	}

	public List() {
		pierwszyElement = null;
		ostatniElement = null;
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isEmpty() {

		return pierwszyElement == null;
	}

	@Override
	public int size() {
		if (isEmpty()) {
			return 0;
		} else {
			int rozmiar = 0;
			ListElement<T> element = pierwszyElement;
			while (element != null) {
				element = element.getNext();
				rozmiar++;
			}
			return rozmiar;
		}
	}

	@Override
	public T get(int index) throws Exception {
		if (isEmpty()) {
			throw new Exception();
		}
		ListElement<T> elementPobierany = getElement(index);
		if (elementPobierany == null) {
			return null;
		} else {
			return elementPobierany.getValue();
		}
	}

	public ListElement<T> getElement(int index) {
		if (isEmpty()) {
			return null;
		} else {
			int licznik = 0;
			ListElement<T> element = pierwszyElement;
			while (licznik != index) {
				element = element.getNext();
				licznik++;
			}
			return element;
		}
	}

	@Override
	public void remove(int index) {
		ListElement<T> elementDoUsuniecia = getElement(index);
		ListElement<T> elementPrzed = elementDoUsuniecia.getPrevious();
		ListElement<T> elementPo = elementDoUsuniecia.getNext();
		if (elementPo == null) {
			ostatniElement = elementPrzed;
			ostatniElement.zaczepZTylu = null;
		} else {
			elementPrzed.zaczepZTylu = elementPo;
			elementPo.zaczepZPrzodu = elementPrzed;
		}
	}

	@Override
	public void add(T wartosc) {
		ListElement<T> dodawanyElement = new ListElement<T>(wartosc);
		if (isEmpty()) {
			pierwszyElement = dodawanyElement;
			ostatniElement = pierwszyElement;
		} else {
			ostatniElement.zaczepZTylu = dodawanyElement;
			dodawanyElement.zaczepZPrzodu = ostatniElement;
			ostatniElement = dodawanyElement;
		}

	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
