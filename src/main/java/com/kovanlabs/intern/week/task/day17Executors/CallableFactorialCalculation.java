package com.kovanlabs.intern.week.task.oopscollection.day17Executors;


import java.util.concurrent.*;

class FactorialCalculator implements Callable<Integer> {
    int value;

    FactorialCalculator(int value) {
        this.value = value;
    }
    @Override
    public Integer call() throws Exception {
        int factorial = 1;
        for(int i = 1; i<=value; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

public class CallableFactorialCalculation {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        System.out.println("Future Class Operation ");
        Future<Integer> factorialOf10 = executorService.submit(new FactorialCalculator(10));
        Future<Integer> factorialOf20 = executorService.submit(new FactorialCalculator(20));
        Integer a = factorialOf10.get();
        Integer b = factorialOf20.get();
        System.out.println("Factorial of 10 is: " + a);
        System.out.println("Factorial of 20 is: " + b);

        executorService.shutdown();
    }

}
