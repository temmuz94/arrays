package class09;

import java.util.Scanner;

public class ScannerforLoop3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("***Choose an item to buy***");
        System.out.println("");
        System.out.println("New Iphone: 1599$");
        System.out.println("");
        System.out.println(" name of item and amount of money");
        String buyersDecision1= s.nextLine();
        int buyersDecision= s.nextInt();
        while((buyersDecision1.equalsIgnoreCase("New Iphone")||(buyersDecision<1599))) {
            System.out.println("declined");
            int buyersDecision2 = s.nextInt();
        }while(buyersDecision1.equalsIgnoreCase("New Iphone") || (buyersDecision>1599)){
                System.out.println("Your change is "+(buyersDecision-1599));
                break;
    }
}}