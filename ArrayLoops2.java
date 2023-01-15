package class09;

public class ArrayLoops2 {
    public static void main(String[] args) {
        int[] x = new int[5];
        x[0] = 45;
        x[1] = 44;
        x[2] = 33;
        x[3] = 20;
        x[4] = 10;
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            if (i % 2 == 0) {
                sum = sum + x[i];
            }
       }
        System.out.println("**");
        System.out.println(sum);
            System.out.println("****************************");

            int[] y = {10, 20, 30, 4, 5, 6, 7, 80};
            int sum1 = 0;
            for (int j = 0; j < y.length; j++) {if(y[j]%2==0){

                sum1 = sum1 + x[j];
               }System.out.println(sum1);



        }



}}
