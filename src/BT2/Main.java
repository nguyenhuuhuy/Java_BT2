package BT2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("nhập độ dài mảng: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Độ dài không được quá 20 phần tử.");
                System.out.println("Vui lòng nhập lại: ");
            }
        } while (size > 20);

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));
//        int total = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum += arr[i];
//                total++;
            }
        }
//        System.out.println("số lẻ trong mảng: " + total);
        System.out.println("tổng các giá trị có chỉ số lẻ trong mảng: " + sum);
    }
}
