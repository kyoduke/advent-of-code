package adventofcode.day01;

import utils.InputReader;

import java.util.ArrayList;
import java.util.List;

public class Part02 {
    public void result() {
        List<String> inputLines = InputReader.readInputByLine("day01/input.txt", this.getClass());
        var firstCol = new ArrayList<>();
        var secondCol = new ArrayList<>();
        for (String line : inputLines ) {
            String[] splittedLine = line.split(" {3}");
            firstCol.add(splittedLine[0]);
            secondCol.add(splittedLine[1]);
        }

    }
    public static void main(String[] args) {
        new Part02().result();
    }
}
