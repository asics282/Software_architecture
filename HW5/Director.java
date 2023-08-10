package org.example.HW5;

public class Director implements Worker{
    private String name;

    public Director(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Директор " + name + " работает");
    }
}
