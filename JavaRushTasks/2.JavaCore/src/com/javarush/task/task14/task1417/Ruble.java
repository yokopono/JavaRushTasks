package com.javarush.task.task14.task1417;

/**
 * Created by solovev.grigoriy on 09.04.2017.
 */
public class Ruble extends Money {
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
