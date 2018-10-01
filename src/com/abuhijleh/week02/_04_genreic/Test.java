package com.abuhijleh.week02._04_genreic;

public class Test {

    public static void main(String[] args) {
//        GadgetsBag gadgetsBag = new GadgetsBag();
////        MoneyBag moneyBag = new MoneyBag();
//
//        gadgetsBag.add("bateekh");
//        gadgetsBag.add("shemmam");
//        System.out.println(gadgetsBag.getGadgets());

        Bag<String> gadgetsBag = new Bag<>();
        gadgetsBag.add("bateekh");
        gadgetsBag.add("shemamma");
        gadgetsBag.getAll().forEach(System.out::println);

        Bag<Integer> integerBag = new Bag<>();
        integerBag.add(5);
        integerBag.add(50);
        System.out.println(integerBag.getFirst());
        integerBag.getAll().forEach(System.out::println);

        ExtendedBag<Double> doubleExtendedBag = new ExtendedBag<>();
        doubleExtendedBag.add(25.5);
        doubleExtendedBag.add(250.55);
        doubleExtendedBag.remove(0);
        doubleExtendedBag.getAll().forEach(System.out::println);
    }
}
