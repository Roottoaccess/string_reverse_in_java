import java.util.Scanner;
public class str_reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string you want: ");
        String str = sc.nextLine();

        String result = "";

        Engine(str.length() - 1,str, result);
    }

    public static void Engine(int i, String str, String result){


        if(i == 0){
            result += str.charAt(i);
            System.out.print(result);
            return;
        }

        result += str.charAt(i);
        Engine(i - 1, str, result);
    }
}