package pl.sdacademy.model;

public class Karteczka {

    public Karteczka(String napis) {
	super();
	this.napis = napis;
    }

    public Karteczka() {
	// TODO Auto-generated constructor stub
    }

    String napis;

    public String getNapis() {
	return napis;
    }

    public void setNapis(String napis) {
	this.napis = napis;
    }

  @Override
  public String toString() {
    return "Karteczka [napis=" + napis + "]";
  }

}
