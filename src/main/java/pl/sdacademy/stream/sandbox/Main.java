package pl.sdacademy.stream.sandbox;

import java.util.ArrayList;
import java.util.List;

import pl.sdacademy.enums.Miasto;
import pl.sdacademy.enums.Plec;
import pl.sdacademy.model.Kursant;
import pl.sdacademy.predicate.sandbox.Predykaty;

public class Main {

	public static void main(String[] args) {
		List<Kursant> kursanci = new ArrayList<>();
		Kursant jacek = new Kursant();
		jacek.setImie("Jacek");
		jacek.setNazwisko("Placek");
		jacek.setPlec(Plec.MEZCZYZNA);
		jacek.setWiek(22);
		jacek.setMiasto(Miasto.POZNAN);
		Kursant julia = new Kursant();
		julia.setImie("Julia");
		julia.setNazwisko("Kotek");
		julia.setPlec(Plec.KOBIETA);
		julia.setWiek(25);
		julia.setMiasto(Miasto.POZNAN);

		Kursant staszek = new Kursant();
		staszek.setImie("Stanislaw");
		staszek.setNazwisko("Murek");
		staszek.setPlec(Plec.MEZCZYZNA);
		staszek.setWiek(12);
		staszek.setMiasto(Miasto.GDANSK);

		Kursant tomek = new Kursant();
		tomek.setImie("Tomasz");
		tomek.setNazwisko("Kot");
		tomek.setPlec(Plec.MEZCZYZNA);
		tomek.setWiek(44);
		tomek.setMiasto(Miasto.WARSZAWA);

		Kursant karolina = new Kursant(Plec.KOBIETA, 21, Miasto.POZNAN, "Karolina", "Wielka");
		kursanci.add(jacek);
		kursanci.add(julia);
		kursanci.add(staszek);
		kursanci.add(tomek);
		kursanci.add(karolina);

		Predykaty predykaty = new Predykaty();
		for (int i = 0; i < kursanci.size(); i++) {
			if (predykaty.jestDorosly().test(kursanci.get(i))) {
				System.out.println(kursanci.get(i));
			}
		}
		System.out.println();
		kursanci.stream().filter(predykaty.jestDorosly()).forEach(kursant -> System.out.println(kursant));

		System.out.println("\nwykorzystanie podwojnego dwukropka - ::");
		kursanci.stream().forEach(System.out::println);

		// wypisz nie pelnoletnich
		System.out.println("\nNie pelnoletni kursanci:");
		kursanci.stream().filter(predykaty.nieJestDorosly()).forEach(System.out::println);

		// wypisz kursantow z Poznania
		System.out.println("\nKursanci z Poznania:");
		kursanci.stream().filter(predykaty.jestZPoznania()).forEach(System.out::println);

		// wypisz ile jest kobiet z Poznania
		System.out.println("\n Kobiet w Poznaniu jest:");

		Object[] tablicaKobiet = kursanci.stream().filter(predykaty.jestKobieta().and(predykaty.jestZPoznania()))
				.toArray();
		System.out.println(tablicaKobiet.length);
		// wypisz ile jest kursantow w Poznaniu

	}

}
