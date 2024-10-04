package main.task_2_fizzbuzz;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class D extends Thread {
    private boolean condition = true;

    private List<Object> list = new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        while (condition) {
            if (!list.isEmpty()) {
                list.forEach(System.out::println);
                list.removeLast();
            }
        }
    }

    public void add(Object o) {
        list.add(o);
    }

    public void kill() {
        condition = false;
    }
}
