package ru.geekbrains.homework5;

import java.util.concurrent.Semaphore;

public class Diner {
    public static void main(String[] args) {
        int currentPhilosophers = 5;

        Philosopher[] philosopher = new Philosopher[currentPhilosophers];

        Semaphore table = new Semaphore(currentPhilosophers, true);

        for (int i = 0 ; i < currentPhilosophers; i++) {
            philosopher[i] = new Philosopher(i + 1, table);
            new Thread(philosopher[i]).start();
        }
    }
}