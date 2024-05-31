package linearsearch;
import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arr[] = new int[5];
    System.out.println("Enter 5 values in array: ");
       for(int i = 0; i <= 4; i++){
           arr[i] = input.nextInt();
       }
        System.out.println("Enter value to find in array: ");
        int target = input.nextInt();
        int loc = 0;
        for(int i = 0; i <= 4; i++){
           if (arr[i]==target){
           System.out.println(target+" found at index "+i);
           loc=1;
           }
            }
           if (loc == 0){
               System.out.println("Element not Phound!");
           }
      
    }
    
}
