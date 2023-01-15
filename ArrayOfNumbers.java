package class09;

public class ArrayOfNumbers {
    public static void main(String[] args) {
        int[]x={10,20,30,45,50};
        int sum=0;

        for (int i = 0; i <x.length ; i++) {
            System.out.println(x[i]);

            sum = sum + x[i];
        }
        System.out.println(sum);

    }}
