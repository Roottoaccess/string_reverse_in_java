import java.util.Scanner;
public class Array_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the limit: ");
        int lmt = sc.nextInt();

        int arr[] = new int[lmt];
        System.out.println("Enter the elements of the array....");
        for(int i = 0; i < lmt; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Your array is......");
        for(int i: arr){
            System.out.print(i+" ");
        }

        Engine(arr);
    }

    public static void Engine( int arr[]){
        System.out.println();
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println("The maximum value of the array is: "+ max);
        }
    }
