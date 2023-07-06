public class Task_2 {
    public static void main(String[] args) {
        int[] intArray = {9,8,7,6,5,4,3,2,1};
        int d = 0;
        if (intArray.length < 9) {
            System.out.println("Error! Array length is less than 9");
        }
        else if (d ==0) {
            System.out.println("Error! d equals 0");
        }
        else {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }
}
