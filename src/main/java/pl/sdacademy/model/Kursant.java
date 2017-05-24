package pl.sdacademy.model;

import pl.sdacademy.enums.Miasto;
import pl.sdacademy.enums.Plec;

public class Kursant {

	public Kursant(Plec plec, int wiek, Miasto miasto, String imie, String nazwisko) {
		super();
		this.plec = plec;
		this.wiek = wiek;
		this.miasto = miasto;
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	Plec plec;
	int wiek;
	Miasto miasto;
	String imie;
	String nazwisko;

	public Kursant() {
		super();
	}

	public Plec getPlec() {
		return plec;
	}

	public void setPlec(Plec plec) {
		this.plec = plec;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	public Miasto getMiasto() {
		return miasto;
	}

	public void setMiasto(Miasto miasto) {
		this.miasto = miasto;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	@Override
	public String toString() {
		return "Kursant [imie=" + imie + ", nazwisko=" + nazwisko + "]";
	}

}
