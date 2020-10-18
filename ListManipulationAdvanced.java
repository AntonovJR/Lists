import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String array = scanner.nextLine();
        List<Integer> arrayListNumbers = fromStringToIntegers(array);

        String input = "";

        while (!input.equals("end")) {
            input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Contains":
                    int containedNum = Integer.parseInt(tokens[1]);
                    if (arrayListNumbers.contains(containedNum)) {
                        System.out.println("Yes");

                    } else {
                        System.out.println("No such number");

                    }

                    break;

                case "Print":
                    if (tokens[1].equals("even")) {
                        for (int i = 0; i < arrayListNumbers.size(); i++) {
                            if (arrayListNumbers.get(i)%2 == 0) {
                                System.out.print(arrayListNumbers.get(i) + " ");
                            }


                        }
                    } else if (tokens[1].equals("odd")) {
                        for (int i = 0; i < arrayListNumbers.size(); i++) {
                            if (arrayListNumbers.get(i)%2 != 0) {
                                System.out.print(arrayListNumbers.get(i) + " ");
                            }


                        }

                    }
                    System.out.println();

                    break;
                case "Get":
                    int result =0;
                    for (int i = 0; i <arrayListNumbers.size(); i++) {

                        result+=arrayListNumbers.get(i);

                    }
                    System.out.println(result);

                    break;
                case "Filter":
                    int number =Integer.parseInt(tokens[2]);
                    if (tokens[1].equals("<")){
                        for (int i = 0; i <arrayListNumbers.size() ; i++) {
                            if (arrayListNumbers.get(i)<number){
                                System.out.print(arrayListNumbers.get(i)+" ");
                            }
                        }
                        System.out.println();

                    }else if (tokens[1].equals("<=")){

                        for (int i = 0; i <arrayListNumbers.size() ; i++) {
                            if (arrayListNumbers.get(i)<=number){
                                System.out.print(arrayListNumbers.get(i)+" ");
                            }
                        }
                        System.out.println();

                    }else if (tokens[1].equals(">")){
                        for (int i = 0; i <arrayListNumbers.size() ; i++) {
                            if (arrayListNumbers.get(i)>number){
                                System.out.print(arrayListNumbers.get(i)+" ");
                            }
                        }
                        System.out.println();


                    }else if (tokens[1].equals(">=")){
                        for (int i = 0; i <arrayListNumbers.size() ; i++) {
                            if (arrayListNumbers.get(i)>=number){
                                System.out.print(arrayListNumbers.get(i)+" ");
                            }
                        }
                        System.out.println();
                    }


                    break;
            }


        }
    }

    private static List<Integer> fromStringToIntegers(String array) {
        String[] parts = array.split("\\s+");
        List<Integer> result = new ArrayList<>();
        for (String part : parts) {
            result.add(Integer.parseInt(part));

        }
        return result;
    }
}
