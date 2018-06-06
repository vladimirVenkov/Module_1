package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MinMaxSumAveragewithMethods {

    private static int aB(int[] a) {
        a[0] += a[1];
        return a[0];
    }

    private static int abB(ArrayList<Integer> d) {
        d.set(0,d.get(0)+d.get(1));
        return d.get(0);
    }

    private static double sumOfNumbers(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];
        }
        return sum;
    }
    private static double averageOfNumbers (double[] numbers) {

        return sumOfNumbers(numbers) / numbers.length ;
    }
    private static double minValueOfNumbers (double[] numbers) {
//        double min = Double.MAX_VALUE;
        double min = 10000;

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
    private static double maxValueOfNumbers (double[] numbers) {
//        double max = Double.MIN_VALUE;
        double max = -10000;

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }


    public static void main(String[] args) throws IOException {

//        int ago = 1;
//        int bago = 2;
//        int[] arr = {3,4};
//        ArrayList<Integer> go = new ArrayList<>();
//        go.add(0, 5);
//        go.add(6);



       // System.out.println(arr[0] + " " + arr[1] + " " + aB(arr) + " " + arr[0]);
//        System.out.println(go.get(0) + " " + go.get(1) + " " + abB(go) + " " + go.get(0));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        double[] nums = new double[length];
        for (int i = 0; i < length; i++) {
            nums[i] = Double.parseDouble(br.readLine());
        }
//        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);

//        Scannner in = new Scanner(System.in);
//
//        int num;
//        int n;
//        for(int i =0 ; i<n; )

//        System.out.print("min=");
//        System.out.printf("%.2f",minValueOfNumbers(nums));
//        System.out.println();
//        System.out.print("max=");
//        System.out.printf("%.2f",maxValueOfNumbers(nums));
//        System.out.println();
//        System.out.print("sum=");
//        System.out.printf("%.2f",sumOfNumbers(nums));
//        System.out.println();
//        System.out.print("avg=");
//        System.out.printf("%.2f",averageOfNumbers(nums));
        System.out.println(String.format("min=%.2f\nmax=%.2f\nsum=%.2f\navg=%.2f",
                minValueOfNumbers(nums),
                maxValueOfNumbers(nums),
                sumOfNumbers(nums),
                averageOfNumbers(nums)
                ));
    }
    }
