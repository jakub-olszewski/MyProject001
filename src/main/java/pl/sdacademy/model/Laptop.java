package pl.sdacademy.model;

public class Laptop {

    Karteczka karteczka;

    public Laptop(String imie) {
	this.karteczka = new Karteczka();
	this.karteczka.setNapis(imie);
    }

  @Override
  public String toString() {
    return "Laptop [karteczka=" + karteczka + "]";
  }

}
