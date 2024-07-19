public class SumOfTwoArrays {
    static void sumofTwoArrays(int[] arr, int arr1[]) {
        int i = arr.length - 1;
        int j = arr1.length - 1;
        int result[] = new int[arr.length > arr1.length ? arr.length : arr1.length];
        int k = result.length - 1;
        while (i >= 0 && j >= 0) {
            result[k--] = arr[i--] + arr1[j--];
        }

        while (i >= 0) {
            result[k--] = arr[i--];
        }
        while (j >= 0) {
            result[k--] = arr1[j--];
        }

        printArr(result);

    }

    static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int arr1[] = { 2, 3, 7, 9, 1, 2, 3, 4 };
        sumofTwoArrays(arr, arr1);

    }
    // output 2,3,7,10,3,5,7,9

}
