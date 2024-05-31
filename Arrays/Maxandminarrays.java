package maxandminarrays;
import java.util.Scanner;
public class Maxandminarrays {
    public static void main(String[] args) {
       int arr[] = new int [7];
       
       Scanner input = new Scanner (System.in);
       System.out.println("Enter 7 values in array: ");
       for(int i = 0; i <= 6; i++){
           arr[i] = input.nextInt();
       }
        int min = arr[0];
        int max = arr[0];

       for (int i = 0; i<=6 ; i++){
           if(arr[i] < min){
               min = arr[i];
           }
           if (arr[i] > max){
               max = arr[i];
           }
       }
       System.out.println("Max Values: " + max);
       System.out.println("Min Values: " + min );
    }
    
}
