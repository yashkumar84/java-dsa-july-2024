public class Sort0and1 {
    static void sort01(int arr[]) {
        int n = arr.length;
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zeroCount++;
        }
        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }

        for (int i = zeroCount; i < n; i++) {
            arr[i] = 1;
        }
    }

    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1 };
        sort01(arr);
        printArr(arr);

    }

}
