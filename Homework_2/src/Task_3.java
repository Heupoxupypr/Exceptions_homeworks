public class Task_3 {
    public static void main(String[] args) {

        int a = 90;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ex) {
            System.out.println("Нельзя делить на 0!!!");
        }
        printSum(23, 234);
        try {
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Элемента с таким порядковым номером нет в массиве!!");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
