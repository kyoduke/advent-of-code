package adventofcode.day01;

import utils.InputReader;

import java.util.ArrayList;
import java.util.List;

public class Part02 {
    public void result() {
        List<String> inputLines = InputReader.readInputByLine("day01/input.txt", this.getClass());
        var firstCol = new ArrayList<Integer>();
        var secondCol = new ArrayList<Integer>();
        for (String line : inputLines ) {
            String[] splittedLine = line.split(" {3}");
            firstCol.add(Integer.parseInt(splittedLine[0]));
            secondCol.add(Integer.parseInt(splittedLine[1]));
        }
        firstCol.sort(null);
        secondCol.sort(null);

        int total = 0;
        for (int firstColNumber : firstCol) {
            int count = 0;
            for (int secondColNumber : secondCol) {
                if (firstColNumber == secondColNumber) {
                    count++;
                }
            }
            total += (firstColNumber * count);
        }
        System.out.println(total);




    }
    public static void main(String[] args) {
        new Part02().result();
    }
}
