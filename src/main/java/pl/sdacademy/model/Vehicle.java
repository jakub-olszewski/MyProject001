package pl.sdacademy.model;

public class Vehicle implements Comparable<Vehicle> {

    public String engine;
    private int wheelsAmount;
    double weight;
    String name;

    public Vehicle() {

    }

    public Vehicle(String engine, int wheelsAmount, double weight) {
	this.engine = engine;
	this.wheelsAmount = wheelsAmount;
	this.weight = weight;

    }

    public Vehicle(String name) {
	this.name = name;
    }

    public String getEngine() {
	return engine;
    }

    public void setEngine(String engine) {
	this.engine = engine;
    }

    public int getWheelsAmount() {
	return wheelsAmount;
    }

    public void setWheelsAmount(int wheelsAmount) {
	this.wheelsAmount = wheelsAmount;
    }

    public double getWeight() {
	return weight;
    }

    public void setWeight(double weight) {
	this.weight = weight;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public int compareTo(Vehicle o) {
	return Double.compare(getWeight(), o.getWeight());
    }

    @Override
    public String toString() {
	return "Vehicle [name=" + name + "]";
    }

}
