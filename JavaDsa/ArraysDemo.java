import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 90;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arr1 = new int[5];
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + ",");
        }
        System.out.print(" }");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i : arr1) {
            System.out.print(i + " ");
        }

    }

}
