package adventofcode.day01;

import utils.InputReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public void result() {
        List<String> lines = InputReader.readInputByLine("day01/input.txt", this.getClass());
        ArrayList<Integer> firstColumn = new ArrayList<>();
        ArrayList<Integer> secondColumn = new ArrayList<>();
        for (String line : lines) {
            String[] splittedLine = line.split(" {3}");
            int firstValue, secondValue;
            firstValue = Integer.parseInt(splittedLine[0]);
            secondValue = Integer.parseInt(splittedLine[1]);
            firstColumn.add(firstValue);
            secondColumn.add(secondValue);
        }
        Collections.sort(firstColumn);
        Collections.sort(secondColumn);

        int result = calculateRows(firstColumn, secondColumn);
        System.out.println("Part 01 Result: " + result);


    }

    public static void main(String[] args) {
        new Part01().result();
    }
}