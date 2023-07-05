import java.util.ArrayList;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        method_1(5, 0);
        method_2(arr);
        Integer[] arr2 = {1,2,3,4};
        method_3(arr2, "a");
    }

    public static int method_1(int a, int b) {
        return a/b;
    }
    public static int[] method_2(int[] array){
        for (int i=0; i < array.length; i++){
            array[i] += array[i+1];
        }
        return array;
    }

    public static Integer[] method_3 (Integer[] arr, String word){
        ArrayList list = new ArrayList<Integer>(Arrays.asList(arr));
        list.add(word);

        return (Integer[]) list.toArray(new Integer[0]);
    }
}
