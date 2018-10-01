package com.abuhijleh.week02._04_genreic;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {

    protected List<T> ts = new ArrayList<>();

    public void add(T t) {
        ts.add(t);
    }

    public T getFirst() {
        return ts.get(0);
    }

    public T getLast() {
        return ts.get(ts.size() - 1);
    }

    public List<T> getAll() {
        return ts;
    }
}
