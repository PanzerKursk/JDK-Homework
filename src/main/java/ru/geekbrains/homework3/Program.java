package ru.geekbrains.homework3;

/*
* Обобщенное программирование
* Создайте интерфейс, который определяет набор методов для работы с базой данных
* (например, сохранение, удаление, получение данных).
* Реализуйте этот интерфейс в конкретном классе.
* */
public class Program {
    public static void main(String[] args) {
        DB<Integer> db = new DB<>();

        db.add(1, "d");
        db.add(2, "w");
        db.add(3, "q");
        db.add(4, "f");
        db.add(5, "a");

        System.out.println(db.getAll());
        System.out.println(db.toString());

        db.remove(2);

        System.out.println(db.getAll());
        System.out.println(db.toString());
    }
}
