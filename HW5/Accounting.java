package org.example.HW5;

public class Accounting implements Worker{
    private int totalMoney;

    public void calculateTotalMoney() {
        // расчет общей суммы денег
        totalMoney = 1000;
    }

    @Override
    public void doWork() {
        System.out.println("Бухгалтерия работает");
    }
}
