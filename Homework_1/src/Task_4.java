import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {6,7,0,9,10};
        try {
            System.out.println(Arrays.toString(arrDivider(arr1, arr2)));
        }
        catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }

    }
    public static Integer[] arrDivider (Integer[] array1, Integer[] array2){
        if (array2.length != array1.length) {
            throw new RuntimeException("Invalid array length!");
        }
        Integer[] res =  new Integer[array1.length];
        for (int i = 0; i < array2.length; i++){
            if (array2[i] == 0) {
                throw new RuntimeException("Invalid divider!\n" +
                        "Element " + i + " of array2 is 0");
            }
            else {
                res[i] = array1[i]/array2[i];
            }
        }
        return res;
    }
}
