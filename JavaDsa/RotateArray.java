public class RotateArray {
    static void rotate(int[] arr) {
        int n = arr.length;
        int variable = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = variable;
    }

    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        int k = 3;
        for (int i = 0; i < k; i++) {
            rotate(arr);
        }
        printArr(arr);

    }

}
