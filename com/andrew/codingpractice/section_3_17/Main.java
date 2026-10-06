package com.andrew.codingpractice.section_3_17;

import java.util.Scanner;

public class Main {

    /*
     * This program allows the user to play rock-paper-scissors against the
     * computer.
     */
    public static void main(String[] args) {
        int playerinput;
        int computerinput = (int) (Math.random() * 3) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice 1(rock) 2(paper) 3(scissors): ");
        playerinput = scanner.nextInt();
        scanner.close();
        if (computerinput == 1) {
            System.out.println("Computer chose rock");
        }
        if (computerinput == 2) {
            System.out.println("Computer chose paper");
        }
        if (computerinput == 3) {
            System.out.println("Computer chose scissors");
        }

        if (playerinput == computerinput) {
            System.out.println("It's a tie!");
        } else if ((playerinput == 1 && computerinput == 3) ||
                (playerinput == 2 && computerinput == 1) ||
                (playerinput == 3 && computerinput == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }

}
