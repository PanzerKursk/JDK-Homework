package ru.geekbrains.homework2;

public class Pair <V, T>{
        private V value1;
        private T value2;

        public Pair(V value1, T value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public V getFirst() {
            return value1;
        }

        public T getSecond() {
            return value2;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "value1 = " + value1 +
                    ", value2 = " + value2 +
                    '}';
        }
}
