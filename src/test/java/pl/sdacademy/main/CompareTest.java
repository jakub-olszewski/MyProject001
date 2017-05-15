package pl.sdacademy.main;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pl.sdacademy.enums.BodyType;
import pl.sdacademy.model.Car;

public class CompareTest {

    @Test
    public void test() {
	// given

	Car car1 = new Car(BodyType.COMBI, 123);
	Car car2 = new Car(BodyType.SEDAN, 19);

	// when
	// String name = cat.getName();

	// then
	// assertTrue(name.equals("Kotek"));
	assertTrue(true);
    }

}
