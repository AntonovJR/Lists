import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int [] special = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int bomb = special[0];
        int power = special[1];

        while(numbersList.contains(bomb)){
            int index = numbersList.indexOf(bomb);
            int leftBound = Math.max(index - power,0);
            int rightBound = Math.min(index+power,numbersList.size()-1);
            for (int i = rightBound; i >= leftBound ; i--) {
                numbersList.remove(i);
            }
        }
        int sum = sumlist(numbersList);
        System.out.println(sum);
    }

    private static int sumlist(List<Integer> numbersList) {
        int result =0;
        for (Integer integer : numbersList) {
            result+=integer;

        }
        return result;
    }
}
