package org.example.threads;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Exception occurred" + e);
                }
                System.out.println("Waited for 1 second");
            }
        };

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Exception occurred" + e);
                }
                System.out.println("Waited for 0.5 second");
            }
        };

        thread.start();
        new Thread(runnable).start();
        System.out.println("I start");
    }
}
