package main.task_1_timer;

import java.text.DecimalFormat;

public class Timer {
    static double currentTime = 0;

    public static void appTimer() {
        appTime().start();

        notifyer().start();
    }

    private static Thread appTime() {
        return new Thread(() -> {
            while (true) {
                if (currentTime > 3600) {
                    System.out.println("Час роботи программи: " + new DecimalFormat("#.#").format(currentTime/3600) + " годин");
                    currentTime++;
                } else {
                    System.out.println("Час роботи программи: " + new DecimalFormat("#").format(currentTime) + " секунд");
                    currentTime++;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
    }

    private static Thread notifyer() {
        return new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5100);
                    System.out.println("Минуло 5 секунд");
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
    }
}
