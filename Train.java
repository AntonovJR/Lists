import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> train = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            if(tokens[0].equals("Add")){
                int people = Integer.parseInt(tokens[1]);
                train.add(people);
            }else{
                int addPeople=Integer.parseInt(tokens[0]);
                for (int wagon = 0; wagon <train.size() ; wagon++) {
                    int sum = train.get(wagon)+addPeople;
                    if(train.get(wagon)+addPeople<=maxCapacity){
                        train.set(wagon,sum);
                        break;
                    }

                }
            }
                    input = scanner.nextLine();
        }
        System.out.println(train.toString().replaceAll("[\\[\\],]", ""));

    }
}
