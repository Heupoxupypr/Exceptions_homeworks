import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter string:");
        String line = in.nextLine();
        if (line == null || line.isEmpty()){
            throw new RuntimeException("String is empty!");
        }
        else {
            System.out.println("Entered string: " + line);
        }
    }
}
