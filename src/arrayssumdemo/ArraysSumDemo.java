package arrayssumdemo;
public class ArraysSumDemo {
    public static void main(String[] args) {
        int arr[] = {15,8,6,7,24};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
            sum += arr[i];
            System.out.println("sum=" + sum);
            System.out.println("平均值=" + (float)sum/arr.length);
    }
}
