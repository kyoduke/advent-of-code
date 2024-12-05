package adventofcode.day02;

import utils.InputReader;

import java.util.Arrays;
import java.util.List;

public class Part01 {
    public void result() {
        List<String> lines = InputReader.readInputByLine("day02/input.txt", this.getClass());
        int safeReportsCount = 0;
        for (String line : lines) {
            int[] numbers = Arrays.stream(line.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            // compare first and second integer to check if the sequence
            // is increasing or decreasing.
            for (int i = 0; i < numbers.length; i++) {
                int nextNumber = numbers[i+1]; // erro
                if (numbers[i+1] > nextNumber ) {
                    safeReportsCount++;
                }
            }

        }
        System.out.println("Resultado: " + safeReportsCount);
    }

    public static void main(String[] args) {
        new Part01().result();
    }
}
