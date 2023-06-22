package org.example;

import java.io.IOException;
import java.util.Scanner;

public class HttpImageStatusCli {
    public void askStatus() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter HTTP status code:");
        int input = numberValidation(scanner);
        new HttpStatusImageDownloader().downloadStatusImage(input);

    }

    private static int numberValidation(Scanner scanner) {
        int input;
        while (!scanner.hasNextInt() || (input = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.print("Please enter valid number! \nEnter:");
        }
        return input;
    }


    public static void main(String[] args) throws IOException {
        HttpImageStatusCli cli = new HttpImageStatusCli();
        cli.askStatus();
    }
}
