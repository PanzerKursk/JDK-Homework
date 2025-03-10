package ru.geekbrains.homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DB <T> implements DBInterface{

    private Map<Integer, T> directory = new HashMap<>();
    private String name;
    private int numID = 0;

    @Override
    public void add(Object value, String name) {
        name = name;
        directory.put(numID++, (T) name);
        System.out.println("Сохранен элемент с ID: " + (numID - 1));
    }

    @Override
    public void remove(Object value) {
        if(directory.remove(value) != null){
            System.out.println("Элемент с ID " + value + " удален");
        }else {
            System.out.println("Элемент с ID " + value + " не найден");
        }
    }

    @Override
    public Object find(Object value, String name) {
        return directory.get(numID);
    }

    @Override
    public ArrayList<T> getAll() {
        return new ArrayList<>(directory.values());
    }

    @Override
    public String toString() {

        return "Результат сохранения в DB: "  +
                "" + directory;
    }
}