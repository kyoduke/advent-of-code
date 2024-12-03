package adventofcode.day01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Part01 {

    public static int calculateRows(ArrayList<Integer> arrOne, ArrayList<Integer> arrTwo) {
        int result = 0;
        for (int i = 0; i < arrOne.size(); i++) {
            int firstColumnValue = arrOne.get(i);
            int secondColumnValue = arrTwo.get(i);
            if (firstColumnValue > secondColumnValue) {
                result += (firstColumnValue - secondColumnValue);
            } else {
                result += (secondColumnValue - firstColumnValue);
            }
        }
        return result;
    }
    public static void main(String[] args) {
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

            int result = calculateRows(firstColumn, secondColumn);
            System.out.println(result);


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}