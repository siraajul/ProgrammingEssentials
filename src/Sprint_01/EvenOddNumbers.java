package Sprint_01;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");

        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
