package org.example;

class CarDemoWithLombok {
    public static void main(String[] args) {
        CarWithLombok CarWithLombok1 = new CarWithLombok("Mustang", "Ford", "black", 2025, 900_000, 10);
        CarWithLombok CarWithLombok2 = new CarWithLombok("Sierra", "Ford", "white", 1997, 300_000, 2);
        System.out.println(CarWithLombok1);
        System.out.println(CarWithLombok2);
        System.out.println(CarWithLombok1.getColor());
        int year = CarWithLombok1.getYear();
        CarWithLombok1.setColor("green");
        System.out.println("Are these objects equal?" + CarWithLombok1.equals(CarWithLombok2));
        System.out.println("The HashCode of this object is: " + CarWithLombok2.hashCode());
        System.out.println("The HashCode of this object is: " + CarWithLombok1.hashCode());
    }
}