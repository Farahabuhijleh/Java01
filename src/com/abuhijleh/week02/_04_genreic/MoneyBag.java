package com.abuhijleh.week02._04_genreic;

import java.util.ArrayList;
import java.util.List;

public class MoneyBag {

    private List<Double> money = new ArrayList<>();

    public void add(double gadget) {
        money.add(gadget);
    }

    public double getFirst() {
        return money.get(0);
    }

    public double getLast() {
        return money.get(money.size() - 1);
    }

    public List<Double> getMoney() {
        return money;
    }
}
