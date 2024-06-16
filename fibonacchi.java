import java.util.Scanner;
import java.lang.Thread;
public class fibonacchi extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value till you want to display the series: ");
        int lmt = sc.nextInt();
        int a = 0; int b = 1;
        System.out.print("0, 1");

        int sum = 0;

        Engine(a,b,lmt, sum);
    }

    public static void Engine(int a, int b,int lmt, int sum){
        try{
            for(int i = 2; i < lmt; i++){
                sum = a + b;
                System.out.print(", "+sum);
                Thread.sleep(500);
                a = b;
                b = sum;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
