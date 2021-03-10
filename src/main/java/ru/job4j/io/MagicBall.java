package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Enter your question:");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                System.out.println("Yes");
                break;
            case 1:
                System.out.println("No");
                break;
            case 2:
                System.out.println("Maybe");
                break;
            default:
                break;
        }
    }
}
