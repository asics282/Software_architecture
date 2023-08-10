package org.example.HW5;

public class BreweryControl {
    public static void main(String[] args) {
        Worker shift = new Shift("Смена 1");
        Worker accounting = new Accounting();
        Worker director = new Director("Андрей Голиков");

        shift.doWork();
        accounting.doWork();
        director.doWork();
    }
}
