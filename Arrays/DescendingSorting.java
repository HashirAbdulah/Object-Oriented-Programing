package javaapplication31;
import java.util.Scanner;
class DescendingSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[7];
        int temp=0;
        System.out.println("Enter 7 values for Sorting:");
        for (int i = 1; i <= 6; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (arr[j] < arr[j + 1]) {
                     temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Values Sorted in Descending Order:");
        for (int i = 0; i <= 6; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

