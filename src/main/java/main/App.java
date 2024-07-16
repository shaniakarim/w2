package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hedgehog hedgehog = new Hedgehog(); // Default hedgehog

        while (true) {
            System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("What does hedgehog say?");
                    String message = scanner.nextLine();
                    hedgehog.speak(message);
                    break;
                case "2":
                    System.out.println("What is the name of the hedgehog:");
                    String name = scanner.nextLine();
                    System.out.println("What is the age of the hedgehog:");
                    String ageInput = scanner.nextLine();
                    try {
                        int age = Integer.parseInt(ageInput);
                        if (age < 0) {
                            System.out.println("Wrong input value");
                        } else {
                            hedgehog = new Hedgehog(name, age);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input value");
                    }
                    break;
                case "3":
                    System.out.println("How many laps?");
                    String lapsInput = scanner.nextLine();
                    try {
                        int laps = Integer.parseInt(lapsInput);
                        if (laps < 0) {
                            System.out.println("Wrong input value");
                        } else {
                            hedgehog.run(laps);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input value");
                    }
                    break;
                case "0":
                    System.out.println("Thank you for using the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Wrong input value");
            }
        }
    }
}
