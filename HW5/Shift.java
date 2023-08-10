package org.example.HW5;

public class Shift implements Worker{
    private String shiftName;

    public Shift(String shiftName) {
        this.shiftName = shiftName;
    }

    @Override
    public void doWork() {
        System.out.println("Смена" + shiftName + " работает");
    }
}
