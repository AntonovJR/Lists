import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            switch (tokens[0]) {
                case "Add":
                    int numToAdd = Integer.parseInt(tokens[1]);
                    numbersList.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(tokens[1]);
                    numbersList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    numToRemove = Integer.parseInt(tokens[1]);
                    numbersList.remove(numToRemove);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    numbersList.add(indexToInsert, numToInsert);
                    //Insert {number} {index}: insert a number at a given index
                    break;

            }

            input = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));

    }
}

