public class Task_2 {
    public static void main(String[] args) {
        String[][] arr = {{"1","2"},{"3","4"},{"1","6"}};
        System.out.println(sum2d(arr));
    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { //Может быть исключение по пустому массиву
            for (int j = 0; j < 2; j++) { //Может быть исключение по колличеству столбцов
                int val = Integer.parseInt(arr[i][j]); //Может быть исключение по формату данных
                sum += val;
            }
        }
        return sum;
    }
}
