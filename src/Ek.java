//    Read 10 numbers from the console entered by the user and print the sum of  thosenumbers.
//-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
// If hasNextInt() returnsfalse, print the message Invalid Number. Continue reading until you have read 10 numbers.
//-  Use the nextInt() method to get the number and add itto the sum.
//-  Before the user enters each number, print the message Enter number #x: where x representsthe
//  count, i.e. 1, 2, 3, 4, etc.
//-For example,the first message printed to the user would be Enter number #1:,the next Enter number #2:, and so on.


import java.util.Scanner;
public class Ek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 1;
        int sum = 0;

        while(x <= 10) {
            System.out.println("Enter number #" +x);
            boolean validnumber = scanner.hasNextInt();
            if(validnumber) {
                int number = scanner.nextInt();
                sum += number;
                x++;
            } else {
                System.out.println("Invalid number");
            }
            // Always return new userInput
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);
        scanner.close();
    }

}

