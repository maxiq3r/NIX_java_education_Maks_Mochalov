package company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String botName = "BotRan";
        String date = "2021";
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + date);
        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What a great name you have," + name + "!");
        int age, remainder3, remainder5, remainder7;
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        remainder3 = scanner.nextInt();
        remainder5 = scanner.nextInt();
        remainder7 = scanner.nextInt();
        age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + " that's a good time to start programming!");
        System.out.println("I can count, enter number");
        int count;
        count = scanner.nextInt();
        for (int i = 0; i <= count; i++) {
            System.out.println(i);
        }
        System.out.println("Let's test your programming knowledge");
        System.out.println("What do you use the method");
        System.out.println("1. It's metod \n 2.To decompose a program into several small subroutines\n 3.To interrupt the execution of a program.");
        int num;
        for (int i=0; i<2;) {
            num = scanner.nextInt();
            if (num == 2) {
                System.out.println("Great, you right!");
                break;
            } else {
                System.out.println("Please, try again");
            }
        }
        System.out.println("Goodbye, have a nice day!");
    }

}
