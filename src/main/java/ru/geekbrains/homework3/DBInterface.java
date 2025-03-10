package ru.geekbrains.homework3;

import java.util.ArrayList;

public interface DBInterface<T> {
        void add(Object value, String name);
        void remove(Object value);
        T find(Object value, String name);
        ArrayList<T> getAll();
}
