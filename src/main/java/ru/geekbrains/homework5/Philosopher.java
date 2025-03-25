package ru.geekbrains.homework5;

import java.util.concurrent.Semaphore;
public class Philosopher implements Runnable, DoingPhilosopher {
    private int id;
    private final Semaphore table;

    public Philosopher(int id, Semaphore table) {
        this.id = id;
        this.table = table;
    }
    public void think() {
        System.out.println("Философ " + id + " думает");
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void eat(){
        System.out.println("Философ " + id + " кушает");
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        getDoPhilosopher();
    }

    private void getDoPhilosopher(){
        for(int i = 0; i < 3; i++) {
            try {
                table.acquire(0);
                think();
                eat();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                table.release();
            }
        }
    }
}

