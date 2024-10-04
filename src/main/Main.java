package main;


import main.task_1_timer.Timer;
import main.task_2_fizzbuzz.FizzBuzz;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Timer.appTimer();
        FizzBuzz.print(30);
        Thread.sleep(10);
        System.out.println("-------------");
    }
}
