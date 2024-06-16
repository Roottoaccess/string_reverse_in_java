import java.util.Scanner;
import java.lang.Thread;
public class Array extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of the array: ");
        int lmt = sc.nextInt();
        int arr[] = new int[lmt];

        System.out.println("Enter the elements one by one.....");
        /* Taking the input in the array */
        for(int i = 0; i < lmt; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Your array is.....");
        /* Displaying the array */
        try{
            for(int i: arr){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        Engine(lmt, arr, 0, 0);
    }

    public static void Engine(int lmt, int arr[], int sum, int i){


        // for(int i = 0; i < lmt; i++){
        //     sum += arr[i];
        // }
        // System.out.println();
        // System.out.println("The sum of the array: "+sum);

        /* Doing the same login in recursion method */
        System.out.println();
        if(i == lmt - 1){
            sum += arr[i];
            System.out.println("The sum of the array: "+sum);
            return;
        }
        sum += arr[i];
        Engine(lmt, arr, sum, i + 1);
    }
}