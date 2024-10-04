package main.task_2_fizzbuzz;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FizzBuzz {
    static D d = new D();

    public static void print(int n) {
        d.start();
        ExecutorService service = Executors.newFixedThreadPool(4);
        for (int i = 0; i <= n; i++) {
            int c = i;
            service.submit(() -> fizzBuzz(c));
            service.submit(() -> buzz(c));
            service.submit(() -> fizz(c));
            service.submit(() -> number(c));
        }
        service.shutdown();
        while (!service.isTerminated()) {
        } d.kill();
    }

    public static void fizzBuzz(int n) {
        if (n % 15 == 0 && n != 0) {
            d.add("FizzBuzz");
        }
    }

    public static void buzz(int n) {
        if (n % 5 == 0 && n % 15 != 0) {
            d.add("Buzz");
        }
    }

    public static void fizz(int n) {
        if (n % 3 == 0 && n % 15 != 0) {
            d.add("Fizz");
        }
    }

    public static void number(int n) {
        if (n % 5 != 0 && n % 3 != 0) {
            d.add(n);
        }
    }
}
