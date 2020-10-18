import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Add":
                    int numToAdd = Integer.parseInt(tokens[1]);
                    list.add(numToAdd);
                    break;
                case "Shift":
                    int count = Integer.parseInt(tokens[2]);
                    if ("left".equals(tokens[1])) {
                        for (int i = 0; i < count; i++) {
                            int temp = list.remove(0);
                            list.add(temp);

                        }

                    } else if ("right".equals(tokens[1])) {
                        for (int i = 0; i < count; i++) {
                            int temp = list.remove(list.size() - 1);
                            list.add(0, temp);
                        }
                    }
                    break;
                case "Remove":
                    int index = Integer.parseInt(tokens[1]);
                    if (isValid(list, index)) {
                        list.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Insert":

                    int numToInsert = Integer.parseInt(tokens[1]);
                    index = Integer.parseInt(tokens[2]);
                    if (isValid(list, index)) {
                        list.add(index, numToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

            }

            input = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }

    private static boolean isValid(List<Integer> list, int index) {
        boolean result = index >= 0 && index < list.size();
        return result;
    }


}
