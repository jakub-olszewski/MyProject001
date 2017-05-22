package pl.sdacademy.stack;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import pl.sdacademy.model.Laptop;

public class IStackTest {

    int maxElement;
    IStack<Laptop> stosLaptopow;
    IStack<Laptop> pelenStos;
    boolean result;

    /**
     * Uruchamia się przed każdym testem
     */
    @Before
    public void setUp() {
	maxElement = 3;
	result = false;
    }

    /**
     * Istnieje mozliwosc dodania elementu do pustego stosu.
     */
    @Test
    public void shouldPushElementToEmptyStack() {
	// given
	Laptop laptopJana = new Laptop("Jan");
	// when
	if (stosLaptopow.isEmpty()) {
	    stosLaptopow.push(laptopJana);
	    Laptop laptopPierwszyZGory = stosLaptopow.peek();
	    result = laptopJana.equals(laptopPierwszyZGory);
	}

	// then
	assertTrue(result);
    }

    @Test
    public void shouldNotPushElementToFillStack() {
	Laptop laptopAni = new Laptop("Anna");
	pelenStos.push(laptopAni);

	if (!laptopAni.equals(pelenStos.peek())) {
	    result = true;
	}
	assertTrue(result);

    }

    @Test
    public void shouldDeleteValueAfterPoping() {
	Laptop pierwszyLaptop = stosLaptopow.peek();
	stosLaptopow.pop();
	Laptop kolejnyLaptop = stosLaptopow.peek();
	if (pierwszyLaptop.equals(kolejnyLaptop)) {
	    result = false;
	}
	assertTrue(result);
    }

}
