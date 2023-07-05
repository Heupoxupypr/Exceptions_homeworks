import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5,6};
        Integer[] arr2 = {6,7,8,9,10};
        System.out.println(Arrays.toString(arrDifference(arr1, arr2)));
    }

    public static Integer[] arrDifference(Integer[] array1, Integer[] array2){
        Integer[] diffArr = new Integer[0];
        if (array1.length != array2.length){
            exceptionOutput (-1);
        }
        else {
            diffArr = new Integer[array1.length];
            for (int i = 0; i < array1.length; i++) {
                diffArr[i] = array2[i] - array1[i];
            }
        }
        return diffArr;
    }

    public static void exceptionOutput (int codeError){
        if (codeError == -1){
            System.out.println("Invalid array length!");
        }
    }
}
