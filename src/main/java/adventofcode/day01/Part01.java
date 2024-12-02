package adventofcode.day01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Part01 {
    public static void main(String[] args) {
        int result = 0;
        try {
            File file = new File("src/main/resources/day01/input.txt");
            Scanner scanner = new Scanner(file);
            ArrayList<Integer> firstColumn = new ArrayList<>();
            ArrayList<Integer> secondColumn = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splittedLine = line.split("   ");
                int firstValue, secondValue;
                firstValue = Integer.parseInt(splittedLine[0]);
                secondValue = Integer.parseInt(splittedLine[1]);
                firstColumn.add(firstValue);
                secondColumn.add(secondValue);
            }
            Collections.sort(firstColumn);
            Collections.sort(secondColumn);

            for (int i = 0; i < firstColumn.size(); i++) {
                int firstColumnValue = firstColumn.get(i);
                int secondColumnValue = secondColumn.get(i);
                if (firstColumnValue > secondColumnValue) {
                    result += (firstColumnValue - secondColumnValue);
                } else {
                    result += (secondColumnValue - firstColumnValue);
                }
            }
            System.out.println(result); // 2166959


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}