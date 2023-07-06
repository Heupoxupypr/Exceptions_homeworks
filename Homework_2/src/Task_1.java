import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        float num = inputNumber();
        System.out.printf("Entered number %.2f\n",num);

    }

    static float inputNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter fractional number:");

        while (!input.hasNextFloat()){
            System.out.println("This is not number! Please repeat!");
            System.out.println("Please enter fractional number:");
            input.nextLine();
        }
        input.close();
        return input.nextFloat();
    }
}
