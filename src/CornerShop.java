package calculator;

import java.util.Scanner;

public class CornerShop {
    public static void main(String[] args) {

        double bubbleGum = 202.0;
        double toffee = 118.0;
        double ideCream = 2250.0;
        double milkChocolate = 1680.0;
        double doughnut = 1075.0;
        double pancake = 80.0;

        double income = bubbleGum + toffee + ideCream + milkChocolate + doughnut + pancake;

        System.out.println("Earned amount:");
        System.out.printf("Bubblegum: $%d\n", Math.round(bubbleGum));
        System.out.printf("Toffee: $%d\n", Math.round(toffee));
        System.out.printf("Ice cream: $%d\n", Math.round(ideCream));
        System.out.printf("Milk Chocolate: $%d\n", Math.round(milkChocolate));
        System.out.printf("Doughnut: $%d\n", Math.round(doughnut));
        System.out.printf("Pancake: $%d\n", Math.round(pancake));
        System.out.println();
        System.out.println("Income: " + income);
        System.out.println("Staff expenses:");
        Scanner sc = new Scanner(System.in);
        int staffExpenses = sc.nextInt();
        System.out.println("Other expenses:");
        int netIncome = sc.nextInt();
        int result = (int) income - netIncome - staffExpenses;
        System.out.printf("Net income: $%-3d%n", result);

    }
}