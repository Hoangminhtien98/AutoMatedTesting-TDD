package fizzbuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số vào đi");
        String number = scanner.nextLine();
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(FizzBuzz.fizzBuzz(number));

    }
}
