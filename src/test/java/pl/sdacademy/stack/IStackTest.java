package pl.sdacademy.stack;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import pl.sdacademy.model.Laptop;

public class IStackTest {

    int maxElement;
    IStack<Laptop> stosLaptopow;

    /**
     * Uruchamia się przed każdym testem
     */
    @Before
    public void setUp() {
	maxElement = 3;
    }

    /**
     * Istnieje mozliwosc dodania elementu do pustego stosu.
     */
    @Test
    public void shouldPushElementToEmptyStack() {
	// given
	Laptop laptopJana = new Laptop("Jan");
	boolean result = false;
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

    }

}
