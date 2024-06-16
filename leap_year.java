import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any year you want to see: ");
        int year = sc.nextInt();

        Engine(year);
    }
    public static void Engine(int year){
        if(year % 4 == 0){
            System.out.println("Leap Year");
        } else if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println("Leap Year");
            } else {
                System.out.println("Not Leap Year");
            }
        } else{
            System.out.println("Not Leap Year");
        }
    }
}
