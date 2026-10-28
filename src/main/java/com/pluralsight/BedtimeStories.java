package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String menu = """
                1. Goldilocks
                2. Hansel and Gretel
                3. Mary Had a Little Lamb
                Enter a number to select a bedtime story:""";

        System.out.print(menu + " ");
        int input = myScanner.nextInt();
        String stories = "";

        switch (input) {
            case 1:
                stories = "goldilocks.txt";
                break;
            case 2:
                stories = "hansel_and_gretel.txt";
                break;
            case 3:
                stories = "mary_had_a_litle_lamb.txt";
                break;
            default:
                break;

        }

        String fileName = "src/main/resources/" + stories;

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(fileName));
            String line = bufReader.readLine();
            int i = 1;

            while (line != null) {
                System.out.println(i + ". " + line);
                line = bufReader.readLine();
                i++;
            }

        } catch (FileNotFoundException e) {
            System.out.print("Input was out of range.");
        } catch (IOException e) {
            System.out.print("You have a talent for breaking things!!");
        }

    }

}
