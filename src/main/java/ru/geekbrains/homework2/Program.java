package ru.geekbrains.homework2;

public class Program {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(4, "Parameter");
        Pair<Integer, Float> pair2 = new Pair<>(4, 5.3234342f);

        System.out.println(pair);
        System.out.println(pair.getFirst().toString() + " " + pair.getSecond());
        System.out.println(pair2.getFirst() + pair2.getSecond());
    }
}

