package Sprint_01;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = input.nextInt();

        boolean prime = true;

        for(int num=2;num<number;num++){
            if(number%num == 0){
                System.out.println("Number is Not Prime");
            }
            else{
                System.out.println("Number is Prime");
            }
        }
    }
}
