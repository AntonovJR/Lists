import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            products.add(input);

        }
        products.sort(Comparator.naturalOrder());
        for (int i = 0; i <products.size() ; i++) {
            System.out.printf("%d.%s%n",i+1,products.get(i));

        }
    }
}
