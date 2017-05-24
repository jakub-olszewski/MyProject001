package pl.sdacademy.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import pl.sdacademy.model.Vehicle;

public class Main {


  public static void main(String[] args) {

    Vehicle dostawczak = new Vehicle("Dostawczy");
    dostawczak.setWeight(2302);
    Vehicle rower = new Vehicle("Rower");
    rower.setWeight(15);

    Vehicle ciezarowka = new Vehicle("Tir");
    ciezarowka.setWeight(7899);

    Vehicle auto = new Vehicle("Auto");
    auto.setWeight(3432);

    List<Vehicle> listaPojazdow = new ArrayList<>();
    listaPojazdow.add(dostawczak);
    listaPojazdow.add(rower);
    listaPojazdow.add(ciezarowka);
    listaPojazdow.add(auto);

    System.out.println("\nPojazdy:");
    for (Iterator iterator = listaPojazdow.iterator(); iterator.hasNext();) {
      Vehicle vehicle = (Vehicle) iterator.next();
      System.out.println(vehicle);
    }

    System.out.println("\nPojazdy posortowane po wadze:");
    Collections.sort(listaPojazdow);
    for (Iterator iterator = listaPojazdow.iterator(); iterator.hasNext();) {
      Vehicle vehicle = (Vehicle) iterator.next();
      System.out.println(vehicle);
    }

    

  }

}
