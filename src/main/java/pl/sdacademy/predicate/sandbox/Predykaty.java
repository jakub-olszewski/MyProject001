package pl.sdacademy.predicate.sandbox;

import java.util.function.Predicate;

import pl.sdacademy.enums.Miasto;
import pl.sdacademy.enums.Plec;
import pl.sdacademy.model.Kursant;

public class Predykaty {

	public static int WIEK_PELNOLETNOSCI = 18;

	public Predicate<Kursant> jestDorosly() {
		return kursant -> kursant.getWiek() >= WIEK_PELNOLETNOSCI;

	}

	public Predicate<Kursant> nieJestDorosly() {
		return p -> p.getWiek() < WIEK_PELNOLETNOSCI;
	}

	public Predicate<Kursant> jestPlci(Plec plec) {
		return kursant -> kursant.getPlec().equals(plec);
	}

	public Predicate<Kursant> jestMezczyzna() {

		return jestPlci(Plec.MEZCZYZNA);

	}

	public Predicate<Kursant> jestKobieta() {
		return jestPlci(Plec.KOBIETA);
	}

	public Predicate<Kursant> jestDoroslaKobieta() {
		return jestKobieta().and(jestDorosly());
	}

	public static void main(String[] args) {

		int suma = jakasLiczba() + 3;
		System.out.println(suma);
	}

	private static int jakasLiczba() {
		return 5;
	}

	public Predicate<Kursant> jestZPoznania() {
		return kursant -> kursant.getMiasto().equals(Miasto.POZNAN);
	}
}
