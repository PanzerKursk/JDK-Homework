package ru.geekbrains.homework2;
/*
* Программные интерфейсы
* Реализуйте простой обобщённый класс, такой как пара или кортеж.
* Затем создайте обобщенный метод, который работает с этим классом.
* Например, вы можете создать метод, который принимает пару и возвращает их сумму или конкатенацию.
* */

public class Program {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(4, "Parameter");
        Pair<Integer, Float> pair2 = new Pair<>(4, 5.3234342f);

        System.out.println(pair);
        System.out.println(pair.getFirst().toString() + " " + pair.getSecond());
        System.out.println(pair2.getFirst() + pair2.getSecond());
    }
}

