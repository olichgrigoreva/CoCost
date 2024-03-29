import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int participants = in.nextInt();
        List<Double> expenses = new ArrayList<>();
        double course = in.nextDouble();
        double sum1 = in.nextDouble();
        double sum2 = in.nextDouble();
        double sum3 = in.nextDouble();

        expenses.add(sum1 * course / participants);
        expenses.add(sum2 * course / participants);
        expenses.add(sum3 * course / participants);

        double total = 0;
        for (Double expense : expenses
        ) {
            total += expense;
        }

        System.out.printf("%.2f", total);
    }

//    public void goAction(int menuId) {
//        switch (menuId){
//            case 1 -> participants =
//            default -> throw new IllegalStateException("Unexpected value: " + menuId);
//        }
//    }
}
