package pl.sdacademy.lambda.example1.model;

public class Jedzenie {

    String nazwa;
    String skladniki;

    public Jedzenie(String nazwa) {
	super();
	this.nazwa = nazwa;
    }

    public String getNazwa() {
	return nazwa;
    }

    public void setNazwa(String nazwa) {
	this.nazwa = nazwa;
    }

    public String getSkladniki() {
	return skladniki;
    }

    public void setSkladniki(String skladniki) {
	this.skladniki = skladniki;
    }

    @Override
    public String toString() {
	return "Jedzenie [nazwa=" + nazwa + ", skladniki=" + skladniki + "]";
    }

}
