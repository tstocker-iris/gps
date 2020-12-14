package com.company;

public class Main {

    public static void main(String[] args) {
        CityId evry1 = new CityId("Evry");
        CityId evry2 = new CityId("Evry");

        System.out.println(evry1.equals(evry2));
        System.out.println(evry1.equals(new CityId("Paris")));
        System.out.println(evry1.equals("Evry"));

        System.out.println(evry1.hashCode());
        System.out.println(evry2.hashCode());

    }
}
