import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Delete":
                    int numToRemove = Integer.parseInt(tokens[1]);
                    while(list.contains(numToRemove)) {
                        list.remove(Integer.valueOf(numToRemove));

                    }
                    break;
                case "Insert":

                    int numToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    if(indexToInsert>=0&&list.size()>indexToInsert) {
                        list.add(indexToInsert, numToInsert);
                    }
                    break;

            }

            input = scanner.nextLine();
        }



        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
