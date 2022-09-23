package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {

        int first = number % 5;
        int second = number % 11;


        if (number <= 0) {
            System.out.println("cannot divide by zero");
        } else {
            if (first == 0 && second == 0) {
                System.out.println("Dividable");
            } else {
                System.out.println("Non-dividable");
            }
        }
    }
}
