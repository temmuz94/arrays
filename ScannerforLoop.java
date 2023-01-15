package class09;

import java.util.Scanner;

public class ScannerforLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter two numbers starting point and ending point");
        int start=s.nextInt();
        int end=s.nextInt();
        for (int i = start; i <=end ; i++) {if(i%2==0){
            System.out.println(i+" is  an even numbers");


            }else {
            System.out.println(i+" is an odd number");
        }
    }}}
