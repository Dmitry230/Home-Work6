public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Task 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Task 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        //Task 4
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }

        //Task 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
        }

        //Task 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //Task 7
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        //Task 8
        int savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }

        //Task 9
        int deposit = 0;
        int monthlyDeposit = 29000;
        double interestRate = 0.12;

        for (int i = 1; i <= 12; i++) {
            deposit += monthlyDeposit;
            double interest = deposit * (interestRate / 12);
            deposit += (int) interest;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
        }

        //Task 10
        for (int i = 1; i <= 10; i++) {
            int result = 2 * i;
            System.out.println("2 * " + i + " = " + result);
        }
    }
}

