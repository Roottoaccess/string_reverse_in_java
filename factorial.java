import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value to find the factorial off: ");
        int i = sc.nextInt();

        int fact = 1;
        Engine(i, fact);
    }
    public static void Engine(int i, int fact){
        if(i == 1){
            fact *= i;
            System.out.println("The factorial of the number is: "+fact);
            return;
        }

        fact *= i;
        Engine(i - 1, fact);
    }
}