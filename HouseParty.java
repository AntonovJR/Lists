import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        int counter = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < counter; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+", 2);
            if (tokens[1].equals("is not going!")) {
                if (!names.remove(tokens[0])) {
                    System.out.printf("%s is not in the list!%n", tokens[0]);
                } else {
                    names.remove(tokens[0]);
                }
            } else if (tokens[1].equals("is going!")) {
                if (names.contains(tokens[0])) {
                    System.out.printf("%s is already in the list!%n", tokens[0]);
                } else {
                    names.add(tokens[0]);
                }
            }

        }
        for (String name : names) {
            System.out.println(name);

        }
    }
}
