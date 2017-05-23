package pl.sdacademy.stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import pl.sdacademy.model.Laptop;
import pl.sdacademy.stack.sandbox.Stack;

public class IStackTest {

    int maxElement;
    IStack<Laptop> stosLaptopow;
    IStack<Laptop> pelenStos;
    boolean result;
    IStack<Laptop> pustyStos;

    /**
     * Uruchamia się przed każdym testem
     */
    @Before
    public void setUp() {
	maxElement = 3;
	result = false;
	stosLaptopow = new Stack(maxElement, Laptop.class);
	Laptop nowyLaptop = new Laptop("Ania");
	stosLaptopow.push(nowyLaptop);
	pelenStos = new Stack(maxElement, Laptop.class);
	pelenStos.push(new Laptop("Jerzy"));
	pelenStos.push(new Laptop("Brajan"));
	pelenStos.push(new Laptop("Dzesika"));
	pustyStos = new Stack(maxElement, Laptop.class);
    }

    /**
     * Istnieje mozliwosc dodania elementu do pustego stosu.
     */
    @Test
    public void shouldPushElementToEmptyStack() {
	// given
	Laptop laptopJana = new Laptop("Jan");
	// when
	if (pustyStos.isEmpty()) {
	    pustyStos.push(laptopJana);
	    Laptop laptopPierwszyZGory = pustyStos.peek();
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
	}else{
		result = true;
	}
	assertTrue(result);
    }

    @Test
    public void shouldReceiveValueWhenPeekingButNoDeleteIt() {
	// given
	Laptop pierwszeSpojrzenie = stosLaptopow.peek();

	// when
	Laptop drugieSpojrzenie = stosLaptopow.peek();

	// then
	if (pierwszeSpojrzenie.equals(drugieSpojrzenie)) {
	    result = true;
	}
	assertTrue(result);
    }

    @Test
    public void shouldReturnZeroAsSizeOfEmptyStack() {
	assertTrue(pustyStos.size() == 0);
    }

    @Test
    public void shouldReturnCorrectSizeForFilledStack() {
	assertTrue(pelenStos.size() == maxElement);
    }

    @Test
    public void shouldReturnTrueIfThereWereNoValuesPutOnStack() {
	assertTrue(pustyStos.isEmpty());
    }

    @Test
    public void shouldReturnFalseIfPushWasCallPreviously() {
	pustyStos.push(new Laptop("Madzia"));
	assertFalse(pustyStos.isEmpty());
    }

    @Test
    public void shouldReturnTrueIfElementWasPushedAndPoped() {
	pustyStos.push(new Laptop("Jula"));
	pustyStos.pop();
	assertTrue(pustyStos.isEmpty());
    }
}
