package com.abuhijleh.week02._04_genreic;

import java.util.ArrayList;
import java.util.List;

public class GadgetsBag {

    private List<String> gadgets = new ArrayList<>();

    public void add(String gadget) {
        gadgets.add(gadget);
    }

    public String getFirst() {
        return gadgets.get(0);
    }

    public String getLast() {
        return gadgets.get(gadgets.size() - 1);
    }

    public List<String> getGadgets() {
        return gadgets;
    }
}
