import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            if(firstPlayer.get(0).equals(secondPlayer.get(0))){
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }else if(firstPlayer.get(0)>secondPlayer.get(0)){
                firstPlayer.add(firstPlayer.get(0));
                firstPlayer.add(secondPlayer.get(0));
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }else if(firstPlayer.get(0)<secondPlayer.get(0)) {
                secondPlayer.add(secondPlayer.get(0));
                secondPlayer.add(firstPlayer.get(0));
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }

        }
        if(firstPlayer.isEmpty()){
            int sum = sumList(secondPlayer);
            System.out.println("Second player wins! Sum: "+sum);
        }else{
            int sum = sumListSecond(firstPlayer);
            System.out.println("First player wins! Sum: "+sum);
        }

    }

    private static int sumListSecond(List<Integer> firstPlayer) {
        int result =0;
        for (Integer integer : firstPlayer) {
            result+=integer;

        }
        return result;
    }


    private static int sumList(List<Integer> secondPlayer) {

        int result =0;
        for (Integer integer : secondPlayer) {
            result+=integer;

        }
        return result;
    }


}
