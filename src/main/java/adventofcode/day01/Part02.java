package adventofcode.day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part02 {
    public static void main(String[] args) {
        try {
            File file = new File("src/main/resources/day01.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splittedLine = line.split("   ");
                int firstValue, secondValue;
                firstValue = Integer.parseInt(splittedLine[0]);
                secondValue = Integer.parseInt(splittedLine[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
