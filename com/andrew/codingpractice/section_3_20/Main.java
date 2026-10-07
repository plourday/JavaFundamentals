package com.andrew.codingpractice.section_3_20;

/* 
* Write a program that prompts the iser to enter a temperature and a wind speed/ 
* The program displays the wind-chill temperature if the input is valid;
* otherwise, it displays a message indicating  whether the temperature and/or wind speed is invalid.
* The forumula for caluclating wind-chill temperature :Twc = 35.74 + 0.6215ta -35.75v^0.16 + 0.4275tav^0.16 
* ta = Outside temperature measured in degrees fahrenheit
* v = speed measured in miles per hour
* Twc = Wind chill temperature
* The formula cannot be used for wind speeds below 2 mph or temperature below -58 degress fahrenheit or above 41 degrees fahreneheit.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter the temperature.");
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();

        if (temperature <= -58 || temperature >= 41) {
            System.out.println("Temperature is invalid.");
            System.exit(0);
        }

        double windSpeed = scanner.nextDouble();

        scanner.close();

        if (windSpeed <= 2) {

            System.out.println("Windspeed is invalid.");
            System.exit(0);
        }
        double calculation = Math.pow(windSpeed, 0.16);

        double windchill = 35.74 + (0.6215 * temperature) - (35.75 * calculation)
                + ((0.4275 * temperature) * calculation);

        System.out.println("The windchill temperature is :" + windchill + ".");

    }

}
