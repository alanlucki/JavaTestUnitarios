package com.platzi.javatests.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount = 0;
    double total = 0;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double x) {
        this.discount = x;
    }

    public void addPrices(double x) {
        prices.add(x);
    }

    private double getSubTotal() {
        double total = 0.0;
        for (int i = 0; i < prices.size(); i++) {
            total += prices.get(i);
        }
        return total;
    }
    public double getTotal() {
        return getSubTotal() * ( 1 - getDiscount());
    }
}
